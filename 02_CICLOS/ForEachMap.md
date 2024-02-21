## ForEach en mapas
En Java, Map es una interfaz que representa una colección de pares clave-valor, donde cada clave está asociada con un único valor. Esta interfaz proporciona métodos para agregar, eliminar y buscar elementos por su clave, así como también para determinar el tamaño del mapa y si está vacío.
```java
import java.util.Map;
import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    Map<Integer, String> nombres = new HashMap<>();
        nombres.put(28, "Ronaldo");
        nombres.put(25, "Messi");
        nombres.put(23, "Falcao");
        nombres.put(25, "Lewandoski");
        nombres.put(19, "James");
        nombres.put(41, "Kane");

        nombres.forEach((id, goles) -> {
            System.out.println("ID: "+ id + " Nombre: " + goles);
        });
  }
}
```
