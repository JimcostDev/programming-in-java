class Principal{
    public static void main(String[] args) {
    // instancia de una clase
    Persona persona = new Persona();
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
  }
}