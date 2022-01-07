## Palabra reservada super
> Nota: se han creado 2 constructores en Persona y la clase Profesor  esta heredando de la clase Persona.

Ahora bien, es posible crear constructores para la clase Profesor de manera normal pero la buena práctica sugiere utilizar la palabra reservada **'super'** cuando se crean constructores.

   *"La palabra reservada 'super' hace referencia al constructor de la clase que se está heredando. Es decir, se está llamando 'super' de Persona."*

Nota que si 'super' no tiene parámetros llamará al constructor sin parámetros de la clase Persona.java. Significa que cuando se crea un nuevo Profesor, ejecuta el constructor de Persona y queda asignada con 'sin nombre'.

Para verifiacrlo, no se le dará nombre a Profesor y en teoría, al no darle nombre pero se utiliza el constructor Profesor y a ése constructor Profesor se le dice que utilice el constructor de Persona, el nombre que le va a asignar será "sin nombre".
