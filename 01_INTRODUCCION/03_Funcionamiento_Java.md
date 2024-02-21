##  Compilación en Java
En Java, cada clase se escribe en un archivo con extensión `.java`.java que tiene el mismo nombre que la clase. Por ejemplo, una clase llamada `Hello` se guarda en un archivo llamado `Hello.java`.

Para compilar el código Java y convertirlo en bytecode, utilizamos un compilador Java como javac, que viene incluido en los kits de desarrollo de Java (JDK o SDK).

La compilación se realiza ejecutando el comando javac seguido del nombre del archivo de la clase que queremos compilar. Por ejemplo:

```Java 
	javac Hello.java
```
Esto generará un archivo con extensión `.class` para cada clase en nuestra aplicación. El bytecode generado será interpretado por la máquina virtual de Java (JVM) para ejecutar el programa.

Para ejecutar un programa Java, usamos el comando java seguido del nombre de la clase principal (es decir, la clase que contiene el método main).

```Java 
	java Hello
```

![compilacion](https://i.stack.imgur.com/oQJKx.png "Compiler Java")


## Compilación y ejecución al mismo tiempo
En Java, la capacidad de compilar y ejecutar un archivo `.java` directamente desde la línea de comandos utilizando el comando `java` y `javac` ha estado disponible desde las primeras versiones del lenguaje. Sin embargo, a partir de Java 11, se introdujo una mejora en la herramienta `javac` que permite compilar y ejecutar archivos Java de forma simplificada con el comando `java`. Esto se conoce como "Single-File Source-Code Execution". 

Entonces, aunque ha sido posible compilar y ejecutar archivos Java directamente desde las primeras versiones, la facilidad de hacerlo con un solo comando se introdujo a partir de **Java 11**.

Se compila y ejecuta con:
```Java 
	java Hello.java
```
	
