# Ordenamiento de elementos mediante método de busqueda lineal
El método de búsqueda lineal permite buscar un elemento dentro de un arreglo.

## Ventaja
La ventaja es que puede buscar elementos dentro del arreglo sin que esté ordenado.

## Desventaja
Su gran desventaja es que va a recorrer absolutamente todos los elementos si no encuentra el elemento que está buscando, 
lo cual lo hace bastante ineficiente a este tipo de búsqueda.

> Dentro de lo más usado, la Búsqueda binaria es lo más eficiente, pero tiene un requisito muy especial y 
> es que el arreglo o el conjunto de elementos ya tiene que estar ordenado, de lo contrario no funciona la búsqueda binaria."

Por lo tanto, siempre que utilice grandes cantidades o almacene grandes cantidades de elementos en una base de datos, lo que se hace es 
crear índices, y estos índices, cuando ingresas elementos al conjunto de datos, se van ordenando y cuando están ordenados la búsqueda binaria es mucho más eficiente.

## Búsqueda lineal
Sobre el mismo ejemplo anterior, se va a buscar números antes de ordenar el método burbuja.

La búsqueda lineal es muy sencilla y solamente es recorrer todo el arreglo, comparar si el elemento que está recorriendo en el arreglo es igual al que está buscando, y lo muestra.
```java
class Lineal{
    public static void main(String[] args) {
        // Declaración del arreglo
        int a[] = new int[10];
        
        // Poblado del arreglo con números aleatorios
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99);
        }
        a[9] = 50;

        // Mostrar el arreglo por consola
        for(int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();

        int x = 50;

        // Búsqueda Lineal
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("el número: "+ x +" está en el índice: " + i);
                break;
            }
        }
    }
}
```
