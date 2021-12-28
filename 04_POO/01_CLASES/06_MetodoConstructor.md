# Método constructor y sobre carga de métodos
## Constructores
Permiten construir un objeto. Una forma explícita de llamar una clase, de crear una instancia a partir de una clase, es la siguiente:
```java
Persona persona = new Persona();
```
El constructor Persona() viene por defecto y Java entiende que cuando se realiza este llamado, crea una instancia con el constructor por defecto, lo que hace es simplemente reservar en memoria todos los atributos que requiera esa clase.

Una buena práctica para crear las clases es crear primero los atributos, luego los constructores y por último todos los métodos.
```java
class Clase{
  // atributos
  
  // constructores
  
  // metodos
}
```
## Constructor clásico
El constructor es un método especial porque no devuelve como void, o el String y no es necesario decirle que devuelva algo. Solamente es necesario colocar la palabra reservada 'public' y el nombre de la clase.
```java
//Persona.java
public Persona(){
  ..
}
```
Este constructor, así como está en este momento y para la clase en estudio, está haciendo la línea de la clase Principal:
```java
//Principal.java
Persona persona = new Persona();
```
Si bien hemos definido un constructor vacío, en ocasiones, es bueno inicializar los valores de las propiedades dentro del constructor. Es decir, inicializar los valores por defecto de un objeto instanciado.
```java
//Persona.java
public Persona(){
  this.nombre = ""; // ésto ya lo hace el constructor actual por defecto
  this.edad = 0; // ésto ya lo hace el constructor actual por defecto
  this.peso = 0f; // ésto ya lo hace el constructor actual por defecto
  this.estatura = 0f; // ésto ya lo hace el constructor actual por defecto
}
```
> Un constructor permite inicializar un objeto con valores por defecto.

## Sobrecarga

uede tener los constructores que desee, pero en esta ocasión haremos lo que se llama 'sobrecarga'.

La sobrecarga es escribir un método con el mismo nombre, pero con diferente firma (parametros)
```java
// Persona.java
..
// Sobrecarga
  public Persona(String n){
      this.nombre = n;
  }
```
