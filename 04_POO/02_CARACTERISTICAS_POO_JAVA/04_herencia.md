# Herencia en java
Permite heredar de otras clases sus características o sus comportamientos.

En la herencia desde el punto de vista de los seres vivos, por lo general se habla de un Padre y de una Madre que genera un hijo.

Java no soporta la multi-herencia es decir, sólo se puede heredar de una sola clase.

Es posible que **muchas clases** hereden de una sola clase pero **no es posible heredar de dos clases**.

> Nota: existen literaturas que sugieren que las Interfaces permiten las multi-herencias y existen literaturas que sugieren lo contrario porque la idea la herencia es poder heredar los atributos y comportamientos. 
> Y las interfaces, si bien tienen atributos finales, no cuentan con atributos variables y no presentan comportamientos. 
> **La versión 9 de Java** cuenta con interfaces funcionales que tienen un solo comportamiento pero no llega a ser multi-herencia.

En éste curso, la herencia estará basada en la literatura clásica donde dice que la herencia en Java es posible solamente desde una sola clase, es decir, no existe multi-herencia.

## Ejemplo:

1. Se creará un paquete team.ed.herencia
2. Se creará una clase Persona
3. La clase Persona tendrá algunos atributos como: nombre, edad, altura y peso.
4. Todos los atributos y/o características serán públicas.
5. La clase tendrá dos comportamientos: 'hablar' y 'comer'. Entonces, la Persona puede saludar y puede comer.
6. Para reutilizar código se va a heredar de la clase Persona, creando la clase Profesor.
7. La clase Profesor puede tener atributos como un nombre, una edad, un altura, y un peso.
8. La clase Profesor también puede tener comportamientos como 'hablar' y 'comer'.

```java
package team.ed.herencia;

public class Persona {
  public int edad;
  public float alto;
  public float peso 
  public void hablar(){
    System.out.println("Hola soy " + this.nombre);
  }
  
  public void comer(){
    System.out.println("Estoy comiendo");
  }
}
```
```java
package team.ed.herencia;

// Un profesor hereda de Persona
public class Profesor extends Persona {
  // sin agregar ningún método, ¿para qué sirve?
  // Se crea un paquete team.ed.ejecutar donde crear el main
   public void ensenar(){
    System.out.println("Estoy enseñando"); 
  }
}
```
```java
package team.ed.ejecutar;

// sin el import la clase Main no sabe dónde está la clase Persona
import team.ed.herencia.Persona 

public class Main {
  public static void main(String[] args){
  // Se crea una Persona
  Persona persona = new Persona();
  // A ésa persona se le agrega un nombre
  persona.nombre = "Pedro";
  // Se le dice a la Persona que 'hable'
  persona.hablar(); 
  }
}
```
Ahora, se ha creado la clase Profesor que extiende de Persona y a continuación será usada para analizar la salida correspondiente.

```java
package team.ed.ejecutar;

// sin el import la clase Main no sabe dónde está la clase Persona
import team.ed.herencia.Persona 

import team.ed.herencia.Profesor

public class Main {
  public static void main(String[] args){
  // Se crea una Persona
  Persona persona = new Persona();
  // A ésa persona se le agrega un nombre
  persona.nombre = "Pedro";
  // Se le dice a la Persona que 'hable'
  persona.hablar(); 
  
  Persona profesor = new Profesor();
  //¿qué utilizar de la clase Persona? Todos los atributos y los métodos son públicos
  profesor.nombre = "Juan";
  profesor.hablar();
  // método enseñar
  profesor.ensenar();
  }
}
```
El Profesor puede heredar las características y métodos de Persona siempre y cuando los modificadores de acceso así lo permitan, además de poder agregarle nuevas características. El Profesor puede enseñar.

Esa es la ventaja de la herencia porque se reutiliza un código ya existente y que sirve, además de poder agregar una nueva característica.

Si se aplica la misma lógica a Persona, Persona no pueden enseñar, porque Persona no sabe ésa parte, ya que no tiene el método enseñar.

> Herencia: un buen uso de la herencia es crear una clase que hereda de otra clase de la cual se necesita sus características y métodos, y además de utilizarlos es posible agregarle nuevos métodos.

