# Implemetación y uso de casting
Cuando asigna valor de un tipo de datos a otro, los dos tipos pueden no ser compatibles entre sí. Si los tipos de datos son compatibles, entonces Java realizará la conversión (automáticamente) que se conoce como **Conversión automática de tipos** y, en caso negativo, deberá hacer un **casting** o convertirlo explícitamente. Por ejemplo, asignando un valor a una variable.

## 1. Conversión automática de tipos o ampliación
La conversión de ampliación tiene lugar cuando dos tipos de datos se convierten automáticamente. Esto sucede cuando:

 * Los dos tipos de datos son compatibles.
 *  Cuando asignamos el valor de un tipo de datos más pequeño a un tipo de datos más grande.

## 2. Conversión explícita de tipo o casting
Si queremos asignar un valor de tipo de dato más grande a un tipo de dato más pequeño, realizamos un casteo/casting o lo que se conoce como conversión de tipo explícito.

 * Esto es útil para tipos de datos incompatibles donde la conversión automática no se puede realizar.
 * byte y int no son compatibles entre sí. Ejemplo de casting:
 
 ```Java 
class Tipo{
    public static void main(String ...args) {
        byte a = 5;
        byte b = 9;

        //casting - casteo
        byte c = (byte) (a + b);

        System.out.println(c);
    }
}
```

```Java 
class Tipo{
    public static void main(String ...args) {
        byte a = 5;
        byte b = 9;

        //casting - casteo
         float c = (float) a / (float) b;

        System.out.println(c);
    }
}
```
 * https://javadesdecero.es/basico/conversion-tipo-ejemplos-casting/
