fun main() {
    var casos = readln().toInt()
    while (casos !=0){
        var datos = readln().split(" ")
        var alturas = mutableListOf<Int>()
        for (i in 0 until casos){
            alturas.add(i,datos[i].toInt())
        }
        var contador = 0
        for (i in 0 until casos){
            if (i != 0 && i != casos-1){
                if (alturas[i] > alturas[i-1] && alturas[i] > alturas[i+1]) contador++
            }
            else if (i == 0){
                if (alturas[i] > alturas[i+1] && alturas[i] > alturas[casos-1]) contador++
            }
            else{
                if (alturas[i] > alturas[i-1] && alturas[i] > alturas[0]) contador++
            }
        }
        println(contador)
        casos =readln().toInt()
    }

}

/*
En 1969 se inauguró el Parque de Atracciones de Madrid; su atracción estrella era la montaña rusa "Siete picos", que, 
tras 36 años de servicio y unos 77 millones de usuarios, fue desmontada en 2005 para, como ella mismo "dijo" en su carta 
de despedida, dejar paso a las nuevas generaciones.

Curiosamente, pese a su nombre, aquella montaña rusa no tenía siete picos. Si llamamos "pico" a un punto del recorrido que 
está más alto que el inmediatamente anterior y el inmediatamente siguiente, entonces tenía como mucho 6 y ni siquiera las 
crónicas se ponen de acuerdo en esto.

Dado el recorrido de varias montañas rusas, ¿puedes contar el número de picos? Ten en cuenta que las montañas rusas son 
circulares, y el punto de inicio de la entrada ¡podría ser un pico!


 

Entrada
El programa leerá de la entrada estándar múltiples casos de prueba, cada uno con la descripción de una montaña rusa.

Una montaña rusa queda descrita por un primer número 2 ≤ n ≤ 1.000 indicando cuántas veces se ha anotado la altura del 
recorrido. A continuación vienen, en otra línea, n números positivos (menores que 1.000) con todas esas alturas.

La entrada termina con una montaña rusa sin alturas que no deberá procesarse.



Salida
Para cada caso de prueba el programa escribirá el número de picos de la montaña rusa que representa. Recuerda que las 
montañas rusas son circuitos cerrados, y tras el final vuelven a comenzar.
 */