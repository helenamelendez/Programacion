fun fibonacci(x: Int): Int{
    when {
        x == 0 -> return 0
        x == 1 -> return 1
        else -> return fibonacci(x-1)+fibonacci(x-2)
    }
}

/*
La sucesión de Fibonacci
La sucesión de Fibonacci es la sucesión de números:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Cada número se calcula sumando los dos anteriores a él.

el 2 se obtiene sumando los dos números anteriores (1+1),
el 5 es (2+3),
etc.
A la sucesión de Fibonacci se le atribuyen poderes casi “esotéricos”. Si tienes tiempo te puede resultar agradable y curioso leer el siguiente artículo

http://www.neoteo.com/la-sucesion-de-fibonacci-en-la-naturaleza/

La serie de fibonacci tiene la siguiente definición matemática

 f0 = 0
 f1 = 1
 f2 = fn-1 + fn-2

que es una definición de naturaleza recursiva.

SE PIDE:  escribir un método estático en Java  llamado fibonacci()  si le pasa  un entero n>=0 que representa una posición en la serie de fibonacci devuelve el valor correspondiente a dicha posición.

Aunque la solución de Fibonacci se puede obtener escribiendo un bucle, se pide en este caso que  resuelvas el ejercicio utilizando recursividad.
*/