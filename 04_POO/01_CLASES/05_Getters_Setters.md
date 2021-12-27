# Implementación de métodos set y get
## private
Palabra reservada que permite proteger, tanto los atributos como los métodos.
```java
// Persona.java
	class Persona {
	  // atributos
	  private String nombre;
	  private int edad;
	  private float peso;
	  private float estatura;
	}
```
Si intentas ejecutar notaras que los atributos no son visibles desde otra clase, y no permitirá la compilación. Entonces, con la palabra reservada 'private' indica que los atributos sólo serán visibles dentro de la misma clase.

Sí son visibles sólo dentro de la misma clase ¿cómo puedes llegar a ellos? ¿cómo asignar valores y obtenerlos?

Se crearán métodos que permitan llegar a ésos atributos, los getter y setter.

* Get: para obtener valores
* Set: para asignar valores

Por cada uno de los atributos se pueden crear un getter y un setter, no tiene que hacerlo sí o sí, ya que depende de la necesidad.

A continuación se asignan valores las variables (atributos) desde otra clase. En éste caso, desde la clase Principal.
```java
// Persona.java
class Persona {
  // atributos
  private String nombre;
  private int edad;
  private float peso;
  private float estatura;
  // Métodos o comportamientos
  
  // Setter
  void setNombre(String n){
	   this.nombre = n;
	}
	
	// Getter
	String getNombre(){
	   return this.nombre;
	}
}
```
Se modifica la clase Principal para acceder a los atributos como se indica en las siguientes líneas de código.

```java
// Principal.java
	class Principal {
	  public static void main(String[] args) {
	    // instancia de una clase
	    Persona persona = new Persona();
			persona.setNombre("Ronaldo Jimenez");	
		        // mostrar el objeto por consola
			System.out.println("Nombre: " + persona.getNombre());
	  }
}
```
Los getters y los setters son necesarios para acceder a las propiedades privadas de una clase.

## Método Set
Los métodos son los comportamientos que tienen las clases y para el ejemplo que se está tratando, la clase Persona tiene un comportamiento de asignar nombre y un comportamiento de obtener un nombre.
```java
void setNombre(String n){ // línea que se conoce como la 'firma del método'
    this.nombre = n; // comportamiento del método
}
```
Cuando escribe la firma del método set, éste necesita saber qué devuelve el método, es decir, cuando el método es ejecutado ¿qué debe devolver?

Generalmente cuando los valores son asignados no se busca retornar ningún valor, sólo se busca asignar un valor y nada más.

La palabra reservada **'void'** indica que no va a devolver valores, sólo se encarga de asignarlos. Una buena práctica para definir un setter es anteponer la palabra set seguida del atributo que desea modificar o acceder, de nombre arbitrario y sólo se requiere no utilizar palabras reservadas del lenguaje.

Luego de ello, entre paréntesis, puede escribir los parámetros (n) de ése método. Para el ejemplo en estudio, es necesario recibir un valor para poder asignarle a la propiedad nombre. En caso de requerir de más parámetros, éstos se escriben separados por comas.

Se abren llaves y dentro de ellas se coloca el comportamiento, es decir, lo que tiene que hacer ése método. Para el ejemplo en estudio, se utiliza la palabra reservada **'this'** que se refiere a la clase y en éste caso se refiere al objeto con el que se esta trabajando.

Entonces, a ésta clase (Persona), a la propiedad 'nombre' se asigna el valor que se recibe en el parámetro n.

## Método Get
```java
String getNombre(){
   return this.nombre;
}
```
Para obtener ése valor, debemos escribir la firma que debe decirnos qué va a devolver y en éste caso devuelve un String porque 'nombre' es de tipo String. Luego va el nombre del método get seguido del nombre arbitrario, en éste caso Nombre debido al atributo al que se hace referencia. Y luego, entre llaves, se escribe un 'return' para devolver el el atributo de la clase u objeto this.
https://replit.com/@RonaldoJimenez2/Persona#Main.java
