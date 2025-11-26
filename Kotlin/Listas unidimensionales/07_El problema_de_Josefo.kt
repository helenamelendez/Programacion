fun main() {
    var casos = readln()
    while (casos != "0 0") {
        var datos = casos.split(" ")
        var lista  = (1 .. datos[0].toInt()).toMutableList()
        var salto = datos[1].toInt()
        var siguiente = 0
        while (lista.size > 1){
            siguiente = siguiente + salto
            siguiente = siguiente%lista.size
            lista.removeAt(siguiente)
        }
        println(lista[0])
    casos = readln()
    }
}

/*
El problema recibe el nombre de Flavio Josefo, historiador judío que vivió en el siglo I. Según el relato del asedio de 
Yodfat de Josefo, él y sus 40 soldados quedaron atrapados en una cueva por los soldados romanos. Eligieron el suicidio 
durante la captura, y establecieron un método para suicidarse en serie por sorteo. Josefo afirma que, por suerte o, 
posiblemente de la mano de Dios, él y otro hombre se mantuvieron hasta el final y se rindieron a los romanos en lugar de 
matarse a sí mismos(y vivió para contarlo). 

Descripción del problema:
Hay gente de pie en un círculo a la espera de ser ejecutada. La cuenta comienza en un punto y dirección específica del 
círculo. Después de que se haya saltado a un número determinado de personas, la siguiente persona es ejecutada. El 
procedimiento se repite con las personas restantes, a partir de la siguiente persona, que va en la misma dirección y 
omitiendo el mismo número de personas, hasta que solo una persona permanece y se libra.


Este problema se puede resolver directamente con una fórmula matemática pero para hacerlo más sencillo tomaremos las 
siguientes simplificaciones. El círculo lo describimos como una lista y se entiende que el siguiente al último es el primero.  Los nombres de los soldados será simplemente un número. Si hay n soldados la lista inicial contendra números de 1 a n. Empezamos la cuenta de saltos  por el primero de la lista 

Por ejemplo para  6 soldados con un salto de tamaño 2 vamos recalculando la lista de forma iterativa

Primera eliminación:

Índice actual: siguiente = 0.
Calcular siguiente índice: siguiente = 0 + 2 = 2.
Eliminar elemento en índice 2: 3.
Lista después de eliminación: [1, 2, 4, 5, 6].
Segunda eliminación:

Índice actual: siguiente = 2.
Calcular siguiente índice: siguiente = 2 + 2 = 4.
Eliminar elemento en índice 4: 6.
Lista después de eliminación: [1, 2, 4, 5].
etc .

Ten en cuenta que para recalcular el valor del siguiente de forma circular, simplifica mucho utilizar el operador módulo %

Entrada: 
dos enteros separados por un espacio, el primer espacio indica la longitud de la lista, es decir, el 
número de soldados, y el segundo el valor del salto.

Salida: 
el nombre(número) del último soldado.
 */