## Palabra reservada super
> Nota: se han creado 2 constructores en Persona y la clase Profesor  esta heredando de la clase Persona.

Ahora bien, es posible crear constructores para la clase Profesor de manera normal pero la buena práctica sugiere utilizar la palabra reservada **'super'** cuando se crean constructores.

   *"La palabra reservada 'super' hace referencia al constructor de la clase que se está heredando. Es decir, se está llamando 'super' de Persona."*

Nota que si 'super' no tiene parámetros llamará al constructor sin parámetros de la clase Persona.java. Significa que cuando se crea un nuevo Profesor, ejecuta el constructor de Persona y queda asignada con 'sin nombre'.

Para verifiacrlo, no se le dará nombre a Profesor y en teoría, al no darle nombre pero se utiliza el constructor Profesor y a ése constructor Profesor se le dice que utilice el constructor de Persona, el nombre que le va a asignar será "sin nombre".

## ejemplo:
```java
//Persona.java
package com.jimcostdev.herencia;

public class Persona {
  public String nombre;
  public int edad;
  public float alto;
  public float peso;

  // constructor: cada vez que se crea una persona se crea sin nombre
  // super sin parámetros llamaría el constructor a continuación
  public Persona(){
    this.nombre = "sin nombre";
  }
  
  public void hablar() {
    System.out.println("Hola soy " + this.nombre);
  }

  public void comer() {
    System.out.println("Estoy comiendo");
  }
}
```

```java
//Profesor.java
package com.jimcostdev.herencia;

// Un profesor hereda de Persona
public class Profesor extends Persona {

  // Constructor
  public Profesor(){
    super(); // se utiliza cuando se crean constructores
  }

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
  @Override
  public void comer() {
    System.out.println("Estoy comiendo, soy vegetariana");
  }
}
```

## ejecucion:

```java
//Main.java
import com.jimcostdev.herencia.Persona;
import com.jimcostdev.herencia.Profesor;

class Main {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Ronaldo";
    persona.hablar();
    persona.comer();

    Profesor profe = new Profesor();
    ///profe.nombre = "Sara";

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

Hola soy sin nombre//*** Aquí esta la salida que estamos estudiando
Estoy enseñando
Estoy enseñando Java
Estoy enseñando Java el dia lunes
Estoy comiendo, soy vegetariana
```
