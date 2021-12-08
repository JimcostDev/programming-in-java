# Ordenamiento de elementos mediante método burbuja 
El ordenamiento de un grupo de elementos más simple se conoce como ordenamiento tipo burbuja.

Para buscar elementos dentro de un arreglo, el método más simple para hacerlo es a través de la búsqueda lineal.

Ninguno de estos dos métodos son recomendados para utilizarlos en producción, pero como principiantes, es la mejor forma de saber cómo ordenar un grupo de elementos y cómo buscar dentro de ese grupo. Una vez comprendido estos métodos, puede descubrir otros mucho más eficientes, como el Quicksort para ordenar elementos y la búsqueda binaria sobre un arreglo que esté ordenado.

Ejemplo: a continuación se crea un arreglo de enteros de 10 elementos, y con un for clásico se recorre el arreglo colocando números aleatorios.

 ```java
// Burbuja.java
	class Burbuja {
	  public static void main(String[] args) {
	
	    // Declaración del arreglo
	    int a[] = new int [10];
	
	    // Poblado del arreglo con números aleatorios
	    for(int i = 0; i < a.length; i++){
	        a[i] = (int)(Math.random() * 99); // aplicando casting
		  // Math.random genera un número float entre 0.0 y 0.9999999999
		  }
		    // Mostrar el arreglo por consola
		  for( int v : a){
		      System.out.println(v);
		  }
		}
	}
```
El resultado de la operación (Math.random() * 99) da como resultado un valor flotante aleatorio, entonces se aplica casting para convertirlo a entero con (int), y por último lo guarda en la posición i. Así se está poblando el arreglo.

## Ordenar el arreglo por el método burbuja
1. Recorrer completo el arreglo tantas veces como elementos contenga menos 1. Es decir, si el arreglo tiene 10 elementos se recorre 9 veces el arreglo completo.
2. En cada recorrido se compara el elemento actual con el elemento siguiente, para saber si están ordenados. Si no lo están, los ordena.

A continuación se muestra la secuencia de recorrer el arreglo y ordenarlo.
```java
original: 5, 6, 9, 1, 14, 12
1.        5, 6, 1, 9, 12, 14
2.        5, 1, 6, 9, 12, 14
3.        1, 5, 6, 9, 12, 14 // la lógica dice seguir
4.        1, 5, 6, 9, 12, 14 // la lógica dice seguir
5.        1, 5, 6, 9, 12, 14 
```
La lógica del algoritmo dice realizar 5 pasadas para este caso, a pesar de que en la tercera ya los haya ordenado.

## Codigo Burbuja (solución):
```java
	// Código método Burbuja
        for (int recorrido = 0; recorrido < a.length - 1; recorrido++) {
            for (int elemento = 0; elemento < a.length - 1; elemento++) {
                if (a[elemento] > a[elemento + 1]) {
                    int t = a[elemento];
                    a[elemento] = a[elemento + 1];
                    a[elemento + 1] = t;
                }
            }
        }

        // Mostramos el arreglo ya ordenado
        for (int v : a) {
            System.out.print(v + " ");
        }

        System.out.println();
```
