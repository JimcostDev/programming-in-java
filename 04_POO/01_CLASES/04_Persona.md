
## Creación de una clase con atributos:
```java
// Persona.java
  class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private float peso;
    private float estatura;
    }
```
Para poder crear objetos a partir de esta clase es necesario instanciar. A continuación, se crea una clase principal y para instanciar a una persona se realiza lo siguiente:

```java
// Principal.java
  class Principal {	  
    public static void main(String[] args) {
      Persona persona = new Persona(); // instancia
    }
  }
```
El tipo de dato, o la clase va en mayúscula (Persona) y la variable en minúscula (persona).

A continuación se accede a sus atributos y se muestra por consola.
```java
// Principal.java
  class Principal {
   public static void main(String[] args) {
    // instancia de una clase
    Persona persona = new Persona();	
		// acceder a los atributos
		persona.nombre = "Ronaldo Jimenez";
		persona.edad = 22;
		persona.peso = 60f;
		persona.estatura = 1.86f;
		
    // mostrar el objeto por consola
    System.out.println("Nombre: " + persona.nombre);
    System.out.println("Edad: " + persona.edad);
    System.out.println("Peso: " + persona.peso);
    System.out.println("Estatura: " + persona.estatura);
	}
}
```
