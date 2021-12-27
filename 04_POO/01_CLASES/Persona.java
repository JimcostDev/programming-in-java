class Persona {
  // Atributos
  private String nombre;
  private int edad;
  private float peso;
  private float estatura;

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

  void setPeso(float p){
      if (p < 0 || p > 300) {
      System.out.println("El peso no es valido");
    } else {
      this.peso = p;
    }
  }

  void setEstatura(float es){
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

  float getPeso (){
      return this.peso;
  }

  float getEstatura (){
    return this.estatura;
}
}