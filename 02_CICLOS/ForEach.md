# Ciclo ForEach
Este ciclo nos sirve para recorrer listas, arrays o mapas
``` java
class Main {
  public static void main(String[] args) {
    // foreach funciona para recorrer arrays
        // for(variable_temporal : array) {
            // sentencia
        // }

        int []numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        String []nombres = new String[]{"Ronaldo", "Juan", "Alexys", "Ari", "Alex", "Lee"};

        for(int v : numeros) { //v alamacena cada uno de los elementos que se estan reccoriendo del array numeros 
            System.out.println(v);
        }

        for(String n : nombres) {//n alamacena cada uno de los elementos que se estan reccoriendo del array nombres
            System.out.println(n);
        }
  }
}
```
