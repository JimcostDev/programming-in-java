# Modificadores de acceso en java
Los modificadores permiten controlar el acceso a los atributos o a los métodos de una clase.
* **public**: Puede ser accedido desde cualquier clase. Es pública, por lo tanto, puede ser accedida desde cualquier lugar.

* **private**: Restringe el acceso solo a la propia clase. Puede ser accedido solo desde su propia clase.

* **default**: Es cuando no hay modificadores colocados, y pueden ser accedidos desde su propia clase, las clases que están en el mismo paquete y las clases que heredan en el mismo paquete. No pueden ser accedidas desde las clases que heredan desde otro paquete.

* **protected**: Puede ser accedido desde su clase, desde las clases que están en el mismo paquete y desde las clases que hereden así estén en otras clases, es decir, desde otro paquete.

Modificador | Clase | Paquete | Herencia (mismo paquete) | Herencia (diferente paquete) | Mundo
--|--|--|--|--|--
public | Si | Si | Si | Si | Si
private | Si | No | No | No | No
default | Si | Si | Si | No | No
protected | Si | Si | Si | Si | No

## Modificadores
1. Todas se pueden acceder desde la propia clase (Columna Clase).
2. Se trata de que si es posible acceder a un atributo de una clase desde otra clase que esté en el mismo paquete (Columna Paquete).
3. Se trata de que si es posible acceder a una subclase, una clase que haya heredado de la clase original, pero que esté en mismo paquete (Columna Subclase (Mismo paquete)).
4. Se trata de que si es posible acceder a una propiedad desde una clase que haya heredado pero desde otro paquete. (Columna Subclase (Diferente paquete)).
5. Se trata de que si es posible acceder desde cualquier parte del mundo (Columna Mundo).

## Entonces

* Public: puede ser accedido desde cualquier lugar.

* Private: accede solo desde la clase.

* Sin modificador: puede acceder desde su propia clase, desde clases que estén en el mismo paquete, desde clases que hereden y que estén en el mismo paquete, pero no puede accederse desde clases que hereden en otro paquete.

* Protected: se puede acceder desde la propia clase, desde las clases que estén en el mismo paquete, desde clases que hereden en el mismo paquete u otro. Pero no se puede acceder desde otras clases que no herede.
