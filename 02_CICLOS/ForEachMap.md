# ForEach en mapas
```java
import java.util.Map;
import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    Map<Integer, String> nombres = new HashMap<>();
        nombres.put(28, "Ronaldo");
        nombres.put(15, "Oswa");
        nombres.put(33, "Clau");
        nombres.put(15, "Tania");
        nombres.put(39, "Silvia");
        nombres.put(41, "Libardo");

        nombres.forEach((id, name) -> {
            System.out.println("ID: "+ id + " Nombre: " + name);
        });
  }
}
```
