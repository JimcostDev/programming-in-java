
# Estructura de una excepción
Las excepciones permiten controlar errores 'poco' frecuentes, errores que se producen en tiempo de ejecución aunque 
algunas excepciones se exigen controlar en tiempo de compilación.

Estos controles son manejados de la siguiente manera: usando la palabra reservada **'try'**, luego **'catch'** enviando
un parámetro de tipo excepción. Es decir, si ocurre un problema en 'try', se manejará el error en 'catch'. 
De manera opcional tiene la palabra reservada **'finally'**, bloque que se ejecuta ocurra o no una excepción. 
Esta última siempre se va a ejecutar, lugar apropiado para colocar liberación de recursos, mensajes, etc.


## La estructura de manejo de excepciones
```java
try {
  // en éste bloque se coloca el código que puede tener
  // errores en tiempo de ejecución
} catch (Exception e) { 
  // Se le indica de qué tipo aunque todas 
  // las Excepciones heredan de Exception
  // o de Runtime Exception. 
  // aquí es donde se maneja la excepción
} finally {
  // en éste bloque se coloca lo que se quiere que se ejecute
  // ocurra o no ocurra una excepción
}
```
## Codigo de 3 ejemplos
https://replit.com/repls/folder/Java/Excepciones
