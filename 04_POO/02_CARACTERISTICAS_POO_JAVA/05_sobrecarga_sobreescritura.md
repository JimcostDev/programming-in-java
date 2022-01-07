# Sobrecarga (overloanding)  y sobreescritura(override) de metodos
##  Sobrecarga:
La Sobrecarga de métodos permite crear varios métodos con el mismo nombre siempre y cuando la firma sea de tipo diferente.
> Recuerda: la firma es el encabezado del método.

El overloading se logra cambiando el orden de los parámetros y/o la cantidad de los mismos.

> Nota: el nombre del parámetro no tiene nada que ver en la firma. Para poder cambiar la firma es necesario enviar un parámetro de tipo diferente o, en caso de varios parámetros deben diferir en la cantidad de parámetros enviados. **La Sobrecarga se realiza en la misma clase**

## Sobreescitura:
Sobreescribir el método o cambiar el comportamiento de un métodos, y **a diferencia de la sobrecarga** que se realiza sobre la misma clase, **la sobreescritura se realiza sobre la herencia o el polimorfismo.**

## ejemplo:
```java
//Persona.java
package com.jimcostdev.herencia;

public class Persona {
  public String nombre;
  public int edad;
  public float alto;
  public float peso;

  public void hablar() {
    System.out.println("Hola soy " + this.nombre);
  }

  public void comer() {
    System.out.println("Estoy comiendo");
  }
}
```

```java

package com.jimcostdev.herencia;

// Un profesor hereda de Persona
public class Profesor extends Persona {

  public void ensenar() {
    System.out.println("Estoy enseñando");
  }

  // sobrecarga
  public void ensenar(String materia, String dia) {
    System.out.println("Estoy enseñando " + materia + " el dia " + dia);
  }

  public void ensenar(String materia) {
    System.out.println("Estoy enseñando " + materia);
  }

  // sobreescritura
  @override
  public void comer() {
    System.out.println("Estoy comiendo, soy vegetariana");
  }
}
```

## ejecucion:

```java


import com.jimcostdev.herencia.Persona;
import com.jimcostdev.herencia.Profesor;

class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Ronaldo";
    persona.hablar();
    persona.comer();

    Profesor profe = new Profesor();
    profe.nombre = "Sara";

    System.out.println("");
    
    profe.hablar();
    profe.ensenar();
    profe.ensenar("Java");
    profe.ensenar("Java","lunes");
    persona.comer(); // sobreescritura de método
  }
}
```

## salida:

```java 
Hola soy Ronaldo
Estoy comiendo

Hola soy Sara
Estoy enseñando
Estoy enseñando Java
Estoy enseñando Java el dia lunes
Estoy comiendo, soy vegetariana
```
