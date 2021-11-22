## SWITCH:
**switch** busca el caso que coincida de acuerdo a la variable que se la paso como parametro y a partir de ese caso encontrado va ejecutar todos los procesos que encuentre de alli en adelante; por eso usamos la palabra reservada **break** para romper la ejecución.

```java 
class Switch{
    public static void main(String[] args) {
        char dia = 1;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
            System.out.println("No existe ese día");
        }
    }
}
```
