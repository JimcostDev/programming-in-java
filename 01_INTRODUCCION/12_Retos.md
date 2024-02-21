## Ejercicios para practicar con Java
1. **Calculadora básica:**
   - Crea un programa que solicite al usuario dos números y una operación (suma, resta, multiplicación o división).
   - Utiliza condicionales para realizar la operación seleccionada e imprimir el resultado.
   ### Solución:
   ```java
   import java.util.Scanner;
   
   public class challenge {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           System.out.print("Ingrese el primer numero: ");
           double num1 = scanner.nextDouble();
   
           System.out.print("Ingrese el segundo numero: ");
           var num2 = scanner.nextDouble();
   
           System.out.println("Ingrese la operación (+ para suma, - para resta, * para multiplicación, / para división):");
           // lee la entrada una cadena de texto, y luego el método charAt(0) obtiene el primer carácter.
           var operacion = scanner.next().charAt(0); 
                                                     
           double resultado = 0;
   
           switch (operacion) {
               case '+':
                   resultado = num1 + num2;
                   break;
               case '-':
                   resultado = num1 - num2;
                   break;
               case '*':
                   resultado = num1 * num2;
                   break;
               case '/':
                   if (num2 != 0) {
                       resultado = num1 / num2;
                   } else {
                       System.out.println("Error: No se puede dividir por cero.");
                       scanner.close();
                       return;
                   }
                   break;
               default:
                   System.out.println("Operación no válida.");
                   scanner.close();
                   return;
           }
   
           System.out.println("El resultado es: " + resultado);
           scanner.close();
       }
   }
```

2. **Conversor de temperatura:**
   - Crea un programa que convierta la temperatura de Celsius a Fahrenheit o de Fahrenheit a Celsius.
   - Solicita al usuario la temperatura y la unidad de medida inicial, y luego realiza la conversión.

3. **Clasificador de números:**
   - Pide al usuario ingresar un número y determina si es positivo, negativo o cero.
   - Utiliza condicionales para imprimir el resultado.

4. **Calculadora de IMC (Índice de Masa Corporal):**
   - Solicita al usuario su peso en kilogramos y su altura en metros.
   - Calcula el IMC utilizando la fórmula: IMC = peso / (altura * altura).
   - Imprime un mensaje indicando si la persona tiene bajo peso, peso normal, sobrepeso o obesidad según su IMC.

5. **Calculadora de descuentos:**
   - Crea un programa que solicite al usuario el precio de un producto y el porcentaje de descuento aplicable.
   - Calcula el precio final después del descuento y muestra el resultado.

6. **Calculadora de edad canina:**
   - Pregunta al usuario la edad de su perro en años.
   - Utiliza una fórmula para calcular la edad equivalente en años humanos (aproximadamente 7 años humanos por cada año canino).
   - Muestra la edad equivalente en años humanos.

7. **Verificador de año bisiesto:**
   - Solicita al usuario un año y verifica si es bisiesto o no.
   - Un año es bisiesto si es divisible entre 4, pero no entre 100, a menos que también sea divisible entre 400.
