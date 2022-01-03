# Introducción y creación de paquetes en java
Java permite organizar el código en paquetes, los cuales no son más que carpetas en las que se va organizando el código. Un paquete o carpeta es donde se organiza el código fuente de manera de tener el código ordenado. En varias carpetas se va a clasificar de diferentes formas.

Hay una razón más allá de tener el código ordenado y se presenta en proyectos grandes, donde por lo general se crean clases que tienden a tener el mismo nombre, y ese nombre puede ocasionar problemas si no están divididos en paquetes.

Imagina que un programador 'A' crea una clase llamada 'Utilidad' y un desarrollador 'B' también creo una clase llamada 'Utilidad'. Si ambas clases pertenecen a paquetes diferentes no hay problema al momento de ejecutar el código.

> Los paquetes no son más que carpetas que permiten organizar nuestro código, lugar donde se colocan los archivos '.java'

A continuación un ejemplo pequeño y la creación de los paquetes necesarios para un proyecto.
```java
// MiProyecto/src/operaciones/suma
 package operaciones;

 public class Suma {
 }
```
```java
// MiProyecto/src/operaciones/resta
 package operaciones;

 public class Resta {
 }
```
* MiProyecto: carpeta
* src: 'source', aquí va el código fuente
* operaciones: package
* Suma: clase Suma.java
* Resta: clase Resta.java
