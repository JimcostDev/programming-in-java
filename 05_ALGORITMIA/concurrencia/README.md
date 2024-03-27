### ¿Qué es la concurrencia?

La concurrencia se refiere a la capacidad de un sistema para manejar múltiples tareas simultáneamente. En programación, la concurrencia se utiliza para ejecutar varias partes del código al mismo tiempo, lo que puede mejorar el rendimiento y la eficiencia de un programa. Esto es especialmente útil en sistemas modernos con múltiples núcleos de CPU, ya que permite aprovechar al máximo los recursos disponibles.

### Aplicación de la concurrencia en este algoritmo

En este algoritmo, se aplica la concurrencia utilizando hilos (threads). Cada archivo CSV se procesa en un hilo separado, lo que permite que múltiples archivos se procesen simultáneamente. Esto es útil para mejorar el rendimiento del programa, especialmente cuando se tienen muchos archivos grandes para procesar.

El uso de la concurrencia aquí permite que el programa aproveche al máximo los recursos disponibles del sistema, como los múltiples núcleos de CPU, para procesar los datos de manera más rápida y eficiente.

### Explicación del Algoritmo

**Este algoritmo tiene como objetivo procesar múltiples archivos CSV que contienen información sobre las ventas de productos en diferentes regiones.**

1. **Creación de un grupo de hilos para procesar los archivos CSV de manera concurrente:**
   - En el método `main`, se crea un `ExecutorService` utilizando `Executors.newFixedThreadPool(numThreads)` para crear un grupo de hilos con un número fijo de hilos que pueden procesar archivos CSV de manera concurrente.
   - Se determina el número de hilos a utilizar basándose en la cantidad de núcleos de CPU disponibles en el sistema (`numThreads`).
   - Cada archivo CSV se procesará en un hilo separado, permitiendo que varios archivos se procesen simultáneamente.

2. **Lectura de un archivo CSV por cada hilo y actualización de las estadísticas:**
   - Se crea la clase `CSVProcessor` que implementa la interfaz `Runnable`. Esta clase representa el trabajo que realizará cada hilo.
   - En el método `run` de `CSVProcessor`, cada hilo lee un archivo CSV utilizando un `BufferedReader` y procesa los datos línea por línea.
   - Se extrae la información sobre las ventas (región, producto y monto de ventas) de cada línea del archivo CSV.
   - Las estadísticas se actualizan utilizando `ConcurrentHashMap` y `AtomicReference` para garantizar la seguridad en el acceso concurrente a los datos.
   - Cada hilo procesa un archivo CSV de manera independiente, lo que permite que múltiples archivos se procesen simultáneamente.

3. **Almacenamiento seguro de las estadísticas utilizando estructuras de datos concurrentes:**
   - Se utilizan `ConcurrentHashMap` y `AtomicReference` para almacenar las estadísticas sobre las ventas por región y por región y producto.
   - `ConcurrentHashMap` se utiliza para almacenar las estadísticas por región, con la región como clave y un `AtomicReference` que contiene el monto total de ventas como valor.
   - `ConcurrentHashMap` también se utiliza para almacenar las estadísticas por región y producto, con la región como clave externa, el producto como clave interna y un `AtomicReference` que contiene el monto total de ventas como valor.
   - Estas estructuras de datos concurrentes garantizan que las actualizaciones a las estadísticas se realicen de manera segura en un entorno concurrente.

4. **Impresión de la información estadística una vez que todos los hilos han terminado de procesar los archivos:**
   - Después de que todos los hilos hayan terminado de procesar los archivos CSV, se llama al método `shutdown()` en el `ExecutorService` para detener la aceptación de nuevos hilos y permitir que los hilos existentes completen su trabajo.
   - Se espera a que todos los hilos terminen su ejecución utilizando `awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)`.
   - Una vez que todos los hilos han terminado de procesar los archivos, se imprime la información estadística sobre las ventas por región y por región y producto.


