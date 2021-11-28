# Ciclo For
Un ciclo for es una estructura iterativa para ejecutar un mismo segmento de código una cantidad de veces deseada; conociendo previamente un valor de inicio, un tamaño de incremento y un valor final para el ciclo (expresión boolena o condición).
``` java
class Main {
  public static void main(String[] args) {
    // for (inicialización; expresión booleana; incremento) {
        // sentencia
    //}
    // break
    // continue

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                // break;
                continue;
            }

            // Aqui hace otro proceso muy largo
            System.out.println("trabajando muy duro:"+i);
        }
  }
}
```

``` java
public class CicloFor
{
    public static void main(String args[])
    {
        for(int i=500;i<=1000;i+=2)
        {
            System.out.println(i);
        }
    }
}
```
