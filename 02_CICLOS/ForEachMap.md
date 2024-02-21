## ForEach en mapas
En Java, Map es una interfaz que representa una colección de pares clave-valor, donde cada clave está asociada con un único valor. Esta interfaz proporciona métodos para agregar, eliminar y buscar elementos por su clave, así como también para determinar el tamaño del mapa y si está vacío.
```java
import java.util.Map;
import java.util.HashMap;
class EXampleMap {
  public static void main(String[] args) {
    Map<String, Integer> nombres = new HashMap<>();
        nombres.put("Ronaldo", 29);
        nombres.put( "Messi", 27);
        nombres.put( "Falcao", 23);
        nombres.put( "Lewandoski", 32);
        nombres.put( "James", 19);
        nombres.put( "Kane", 41);

        nombres.forEach((jugador, goles) -> {
            System.out.println("Goles: "+ goles + " Jugador: " + jugador);
        });

        // Acceder a un valor usando una clave
        Object numGoles = nombres.get("Ronaldo");
        System.out.println("# de goles: " + numGoles);
  }
}
```
