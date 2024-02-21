## Variables y constantes:

```Java 
	class Hola {
    
        public static void main (String ...args){
              
                //delarar variables
                int primerNumero = 10;
                int segundoNumero = 12;
                int resultado;
                
                //declarar constantes
                final int constante = 3.14
                
                //operacion
                resultado = primerNumero + segundoNumero;
                constante = primerNumero + segundoNumero; // esto daria error (al compilar) porque no se puede cambiar el valor a una constante 
                
                //imprimir por consola
                System.out.println(resultado);
        }
}
```
## Inferencia de tipos local 
Las declaraciones de variables en Java han experimentado varias mejoras en las últimas versiones del lenguaje, especialmente con la introducción de la *inferencia de tipos local*, que simplifica la forma en que se declaran las variables. Algunas de estas mejoras son:

A partir de **Java 10**, se introdujo la palabra clave `var`, que permite al compilador inferir automáticamente el tipo de una variable en función del tipo de valor que se le asigna. Esto reduce la necesidad de repetir el tipo de variable y hace que el código sea más conciso.

Ejemplo:
```java
   var number = 10; // En lugar de: int number = 10;
   var text = "Hello"; // En lugar de: String text = "Hello";
   final var message = "Howdy"; 
```
