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

## Ejemplo:
En este ejemplo es un atributo el que se convierta en estático, como el número PI.

Es necesario acceder al atributo que es de clase, de la misma manera que se realizo con el método sin instanciar un objeto de la clase Matemáticas.

```java
public class Matematicas {
 public static float PI = 3.1416f;
  public static int sumar(int a, int b) {
    return a + b; 
  }
}
```

```java
public class PruebaStatic {
  public static void main(String[] args) {
      // Matematicas m = new Matematicas(); 
      int r = Matematicas.sumar(3, 4); 
      System.out.println(r);
      System.out.println("El valor de PI es = " + Matematicas.PI);
    }
}
```
El método 'main' utiliza 'static' porque la máquina virtual, cuando va a ejecutar, no va a instanciar un objeto, en este caso PruebaStatic sino que llama de manera directa el método 'main' desde el nombre de la clase ('PruebaStatic.main') y así ejecuta el método principal de Java sin necesidad de instanciar objetos.

Por eso la firma del método 'main' es 'public', tiene que ser accedido desde cualquier parte de la máquina virtual, 'static' porque no es necesario instanciar un objeto, 'void' porque no debe devolver nada, la palabra reservada 'main' porque Java sabe que es el método principal y sus argumentos que es un array de Strings los cuales pueden ser enviados por medio de consola.
