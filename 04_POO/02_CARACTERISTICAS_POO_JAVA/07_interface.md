## Interfaces en java
Las interfaces en Java permiten firmar un contrato el cual debe cumplirse siempre si la meta es implementar una interface. (Teoría)

> Implementar interfaces no es implementar multi-herencia.

Implementar interfaces permite hacer **Polimorfismo**, poli (varios) + morfo (formas).

> Entonces, gracias a las interfaces se pueden crear diferentes formas que tienen comportamientos parecidos sintácticamente hablando. Es decir, es posible llamar diferentes objetos que son de diferentes clases pero pueden recibir las mismas órdenes sintácticas siempre y cuando ellos posean la misma interface.

## Ejemplo:

1. Tenemos una interfaz llamada figura bidimensional.
2. De la figura se pueden calcular el Área, el Perímetro.
3. Entonces, puede tener un rectángulo, un círculo, un triángulo.
4. El cuadrado es una objeto de la clase Cuadrado.
5. El círculo es una objeto de una clase llamada Circulo.
6. Y el triángulo es un objeto de la clase Tirángulo.
7. Las tres clases diferentes pueden implementar la interface figura (es decir, obtener área y perímetro). Todas ellas tienen que implementar ése método con el objetivo de generar una comunicación con los tres objetos utilizando un sólo método para que obtenga la información requerida.
8. Se crea un nuevo paquete 'formas' y dentro del paquete se crea una interface llamada 'Figura'.

## Codigo del ejemplo:
https://replit.com/@RonaldoJimenez2/interface#Main.java
