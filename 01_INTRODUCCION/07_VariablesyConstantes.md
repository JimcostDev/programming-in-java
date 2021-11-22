# Variables y constantes:

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
