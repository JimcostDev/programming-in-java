import java.util.Scanner;

public class CalculatorBasic {
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