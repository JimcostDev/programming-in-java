class Persona {
  // Atributos
  private String nombre;
  private int edad;
  private float peso;
  private float estatura;

  // Constructores
  public Persona() {
    // Sirve para inicializar los valores por defecto de un objeto instanciado
    this.nombre = "";
    this.edad = 0;
    this.peso = 0f;
    this.estatura = 0f;
  }

  // Segundo constructor
  // sobrecarga: escribir un método con el mismo nombre pero con diferente firma
  public Persona(String n) {
    this.nombre = n;
    //this.saludar();
  }

  // Tercer constructor
  public Persona(String n, int e) {
    this.nombre = n;
    this.edad = e;
  }

  // Metodos (comportamiento)
  // Setters
  void setNombre(String n) {
    if (n == null || n == "") {
      System.out.println("El nombre no puede ser vacio");
    }
    if (n.length() <= 1) {
      System.out.println("El nombre no puede ser tan corto");
    } else {
      this.nombre = n;
    }

  }

  void setEdad(int e) {
    if (e < 0 || e > 150) {
      System.out.println("La edad no es válida");
    } else {
      this.edad = e;
    }
  }

  void setPeso(float p) {
    if (p < 0 || p > 300) {
      System.out.println("El peso no es valido");
    } else {
      this.peso = p;
    }
  }

  void setEstatura(float es) {
    if (es < 0 || es > 3.0f) {
      System.out.println("El tamaño no es valido");
    } else {
      this.estatura = es;
    }
  }

  // Getters
  String getNombre() {
    return this.nombre;
  }

  int getEdad() {
    return this.edad;
  }

  float getPeso() {
    return this.peso;
  }

  float getEstatura() {
    return this.estatura;
  }

  void saludar() {
    System.out.println("Hola, mi nombre es: " + this.nombre);
  }
}