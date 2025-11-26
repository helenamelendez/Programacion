fun main() {
    val nCasos = readln().toInt()
    val Meses = listOf<Int>(30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    for (i in 1..nCasos){
        val DiaMes = readln().split(" ")
        val Dia = DiaMes[0].toInt()
        val Mes = DiaMes[1].toInt()
        var resultado = 0
        for (j in Mes-1 .. Meses.lastIndex){
            if (j == Mes-1) resultado += Meses[j] - Dia
            else resultado += Meses[j]
        }
        println(resultado)
    }

}

/*
Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja? Asumiremos que nos encontramos en un año 
no bisiesto.

Entrada
La entrada comenzará con un entero para especificar el número de casos de prueba que vendrá a continuación. 
Para cada caso de prueba se mostrará una línea en la que aparecerán dos enteros, el primero de ellos será correspondiente 
al día y el segundo correspondiente al mes de una fecha válida.

Salida
Para cada fecha de la entrada, se mostrarán el número de días completos que faltan hasta el día de Nochevieja.
 */