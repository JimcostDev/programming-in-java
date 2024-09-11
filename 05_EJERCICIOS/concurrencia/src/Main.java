import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

class SalesData {
    private String region;
    private String product;
    private BigDecimal salesAmount;

    public SalesData(String region, String product, BigDecimal salesAmount) {
        this.region = region;
        this.product = product;
        this.salesAmount = salesAmount;
    }

    public String getRegion() {
        return region;
    }

    public String getProduct() {
        return product;
    }

    public BigDecimal getSalesAmount() {
        return salesAmount;
    }
}

class CSVProcessor implements Runnable {
    private String filename;
    private ConcurrentHashMap<String, AtomicReference<BigDecimal>> salesByRegion;
    private ConcurrentHashMap<String, ConcurrentHashMap<String, AtomicReference<BigDecimal>>> salesByRegionAndProduct;

    public CSVProcessor(String filename, ConcurrentHashMap<String, AtomicReference<BigDecimal>> salesByRegion,
                        ConcurrentHashMap<String, ConcurrentHashMap<String, AtomicReference<BigDecimal>>> salesByRegionAndProduct) {
        this.filename = filename;
        this.salesByRegion = salesByRegion;
        this.salesByRegionAndProduct = salesByRegionAndProduct;
    }

    @Override
    public void run() {
        // Leer el archivo CSV y procesar los datos
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            // Ignorar la primera línea que contiene los encabezados
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String region = parts[0].replaceAll("\"", "");
                String product = parts[1].replaceAll("\"", "");
                BigDecimal salesAmount = new BigDecimal(parts[3]);

                SalesData data = new SalesData(region, product, salesAmount);

                // Actualizar las ventas por región
                salesByRegion.computeIfAbsent(data.getRegion(), k -> new AtomicReference<>(BigDecimal.ZERO))
                        .getAndUpdate(currentValue -> currentValue.add(data.getSalesAmount()));

                // Actualizar las ventas por región y producto
                salesByRegionAndProduct
                        .computeIfAbsent(data.getRegion(), k -> new ConcurrentHashMap<>())
                        .computeIfAbsent(data.getProduct(), k -> new AtomicReference<>(BigDecimal.ZERO))
                        .getAndUpdate(currentValue -> currentValue.add(data.getSalesAmount()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Lista de archivos CSV
        String[] files = {"Sales_Data_1.csv", "Sales_Data_2.csv", "Sales_Data_3.csv", "Sales_Data_4.csv"};

        // Estructuras para almacenar las estadísticas
        ConcurrentHashMap<String, AtomicReference<BigDecimal>> salesByRegion = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, ConcurrentHashMap<String, AtomicReference<BigDecimal>>> salesByRegionAndProduct = new ConcurrentHashMap<>();

        // Crear un grupo de hilos para procesar los archivos CSV
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Procesar cada archivo CSV en un hilo separado
        for (String file : files) {
            executor.execute(new CSVProcessor(file, salesByRegion, salesByRegionAndProduct));
        }

        // Apagar el executor después de que todos los hilos hayan terminado
        executor.shutdown();

        // Esperar a que todos los hilos terminen
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimir las estadísticas
        System.out.println("Ventas por región:");
        salesByRegion.forEach((region, sales) -> System.out.println(region + ": " + sales));

        System.out.println("\nVentas por región y producto:");
        salesByRegionAndProduct.forEach((region, productSalesMap) -> {
            System.out.println(region + ":");
            productSalesMap.forEach((product, sales) -> System.out.println("\t" + product + ": " + sales));
        });
    }
}
