# Operadores:

## 1. Operadores de asignación (=), preincremento (++a) y postincremento (b++)
```java 
public class Operadores {
    public static void main(String[] args) {
        /// Asignación =
        int a = 2;
        int b;
        b = 2 + 2 + 3;
        System.out.println("Asignacion");
        System.out.println(a);
        System.out.println(b);

        // Preincremento
        int f = 0;
        ++f;
        System.out.println("Preincremento");
        System.out.println(f);

        // Postincremento
        int g = 0;
        g++;
        System.out.println("Postincremento");
        System.out.println(g);

        // Preincremento vs Postincremento
        int x = 3;
        int y = 2;
        
        // Comenzamos con preincremento
        int z = x * ++y;
        System.out.println("Comenzamos con preincremento");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Ahora el postincremento
        x = 3;
        y = 2;
        int w = x * y++;
        // x = 3
        // y = ? Primero multiplica y luego aumenta. Termina valiendo 3
        // w = 6
        System.out.println("Ahora el postincremento");
        System.out.println(x);
        System.out.println(y);
        System.out.println(w);
       

        // Recomendación:
        // Nunca utilicen preincremento o postincremento dentro de una asignación.
        // b++;
        // int c = a * b;
        // O así:
        // ++b;
        // int c = a * b;
    }
}
```

## 2. Operadores aritmeticos
```java 
      // Operadores aritméticos
      // + - * /
      // Jerarquía
      // Operador . (POO), operador ()
      // Primero * / (con prioridad de izquierda a derecha)
      // Segundo + - (con prioridad de izquierda a derecha)
      
      int r = 3 + 3 * 3 - 3;
      System.out.println (r)
      // r = 9
```
## 3. Operadores logicos
```java 
    // Tabla de verdad de Y (&&) = es como la multiplicación
    //   A     B     Resultado
    // true   true   true
    // true   false  false
    // false  true   false
    // false  false  false
    
    //saber si esta en la etapa de la niñez:
    
    //forma corta
    int edad = 5;
    boolean ninez = edad <= 11 && edad >=0;
    System.out.println(ninez);
    // ninez = true
    
    //forma larga
    int edad = 20;
    boolean primero = edad <= 11;
    System.out.println(primero);

    boolean segundo = edad >=0;
    System.out.println(segundo);

    System.out.print(primero + " && " + segundo + " = ");

    boolean ninez = primero && segundo;
    System.out.println(ninez);
    // ninez = false
    
    
    // Tabla de verdad de O (||)
    //   A     B     Resultado = es como la suma
    // true   true   true
    // true   false  true
    // false  true   true
    // false  false  false
        
    boolean primero = true;
    boolean segundo = false;

    System.out.print(primero + " || " + segundo + " = ");
    boolean result = primero || segundo; 
    System.out.println(result);
```
