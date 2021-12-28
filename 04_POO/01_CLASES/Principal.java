class Principal {
  public static void main(String[] args) {
    // instancia de una clase
    Persona persona = new Persona();
    Persona segunda = new Persona("Fernando Mendez");
    Persona tercera = new Persona("Xiomara Mendez", 7);

    // acceder a los atributos
    persona.setNombre("Ronaldo Jimenez Acosta");
    persona.setEdad(21);
    persona.setPeso(60f);
    persona.setEstatura(1.86f);

    // mostrar el objeto por consola
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Peso: " + persona.getPeso());
    System.out.println("Estatura " + persona.getEstatura());

    System.out.println("Nombre segunda persona: " + segunda.getNombre());

    System.out.println("Nombre tercera persona: " + tercera.getNombre());
    System.out.println("Edad tercera persona: " + tercera.getEdad());

    persona.saludar();
    segunda.saludar();
    tercera.saludar();
  }
}