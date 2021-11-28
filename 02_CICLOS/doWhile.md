# Ciclo Do While 
Nos permite ejecutar varias veces un pedazo de codigo hasta que se cumpla cierta condición. 
Este ciclo tiene una caracteristica muy peculiar y es que el pedazo de codigo se va a ejcutar la primera vez asi la condición no se cumpla.

```java 
class Main {
  public static void main(String[] args) {

    // do while
    // el codigo se ejecutara por lo menos una vez

    // do {
        // sentencia
    // } while (condición)
    // break: Detiene el ciclo.
    // continue: No va a ejecutar el código del bloque del ciclo
    // que esté luego de la palabra reservada.
    
    int i = 1;
        do {
            System.out.println(i);
            i++;
            if (i % 2 == 0) {
                // break;
                continue;
            }
            //Aquí hay otros procesos que se ejecutan
            System.out.println("estoy despues del continue: " + i);
        } while (i < 10);
  }
}
```
