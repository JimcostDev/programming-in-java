# Condicionales:

```java 
	
 /*Los condicionales se ejecutan con la palabra
 reservada if
 if (condicion) {
    Verdadera
}*/

//EJERCICIO PARA SABER EN QUE ETAPA DE VIDA SE ENCUENTRA UNA PERSONA POR SU EDAD.
public class Condicionales {
    public static void main(String[] args) {
        
        int edad = 400;

        if(edad >= 0 && edad < 18){
            System.out.println("Esta en la etapa de la niñez / adolescecia");
        } else if(edad >= 18 && edad < 65){
            System.out.println("Esta en la etapa de la adultez");
        } else if(edad >= 65 && edad <= 120){
            System.out.println("Esta en la etapa de la vejez");
        } else if(edad > 120){
            System.out.println("Haz vivido mucho, XD");
        } else if(edad < 0){
            System.out.println("Las edades no pueden ser negativas");
        }

        System.out.println("Proceso terminado!");
    }
}
```
## Sin operadores logicos || (OR) - && (AND):
```java 
class prueba {
    public static void main (String ...args){

    //Sin operadores logicos OR y AND
    int edad = -1;
    boolean errada = edad < 0;
    boolean ninez = edad < 18; 
    boolean adultez = edad < 65; 
    boolean vejez = edad < 120; 
    boolean full = edad > 119; 
    if (edad > 0){
        if (ninez == true){
            System.out.println("Estas en la etapa de la niñez / adolescecia = "+ ninez);
        }else if (adultez == true) {
            System.out.println("Estas en la etapa de la adultez = "+ adultez);
        }else if (vejez == true){
            System.out.println("Estas en la etapa de la vejez = "+ vejez);
        }else if (full == true){
            System.out.println("Haz vivido mucho = "+ full);
        }
    } else{
        System.out.println("Datos errados, no existen edades negativas = "+ errada);
    }
    
    System.out.println("Proceso terminado!");

    }
}
```
