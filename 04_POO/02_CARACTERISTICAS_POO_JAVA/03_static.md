# Métodos estáticos
## Miembros estáticos (static)

Todos aquellos atributos o métodos a los cuales se le antepone la palabra 'static' hacen que ese atributo o método se conviertan en atributos o métodos de clase. Es decir, que no se necesita instanciar un objeto para poder acceder a ese atributo o método.

Se crea una clase llamada 'Matemáticas' y se intenta crear un método que sume 2 números.

Y para ejecutar el método sumar se crea una clase llamada 'PruebaStatic' el cual tiene el método 'main'. Y se va a utilizar el método sumar el cual recibe 2 números.

Una vez instanciado el objeto Matematicas 'm' es posible utilizar su método 'sumar'.

La suma de los 2 números devuelve un entero, por lo cual se guarda el resultado en la variable 'r'.

Por último se imprime ese resultado.

```java
public class Matematicas {
  public static int sumar(int a, int b) {
    return a + b; 
  }
}
```

```java
public class PruebaStatic {
  public static void main(String[] args) {
      // Matematicas m = new Matematicas(); // no se instancia porque el metodo sumar es 'static'
      int r = Matematicas.sumar(3, 4); // se llama directamente la clase 'Matematicas'
      System.out.println(r);
		}
}
```
