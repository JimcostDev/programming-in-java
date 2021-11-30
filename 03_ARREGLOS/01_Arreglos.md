# Arreglos:
Un array (arreglo) en Java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo. 
El tamaño de los arrays se declara en un primer momento y no puede cambiar luego durante la ejecución del programa, 
como sí puede hacerse en otros lenguajes. Veremos ahora cómo declarar arrays estáticos de una dimensión.

## Caracteristicas:
1. Tamaño fijo.
2. Sólo puede contener elementos de un mismo tipo.Puede almacenar tipos de datos primitivos o referencias a objetos.

## Conceptos base (atributos):
1. Posición o índice:
2. Los índices en los arreglos comienzan con 0
    
```java
// Grupo de elementos enteros:
    [5, 3, 9, 28, 45]
    índice 0 = 5
    índice 1 = 3
    índice 2 = 9
    índice 3 = 28
    índice 4 = 45
```

## Declaración de arrays:
```java
    int numeros[] = new int[5];
    int personas[] = new int[7];
```
## Asignación de valores a elementos de un arreglo:
```java
    int numeros[] = new int[5];
    numeros[0] = 19;
    numeros[1] = 33;
    numeros[2] = 79;
    numeros[3] = 9;
    numeros[4] = 42;

    // Obtener los valores
    // int x = numeros[0];
    // System.out.println(x);
    // System.out.println(numeros[1]);
```
