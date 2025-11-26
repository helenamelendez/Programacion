fun main() {
    var nCasos = readln().toInt()
    for (i in 0 until nCasos){
        var linea1 = readln().split( " ")
        var linea2 = readln().split(" ")
        var dientesArriba = mutableListOf<Int>()
        var dientesAbajo = mutableListOf<Int>()
        for (i in 0 .. linea1.lastIndex){
            dientesArriba.add(i, linea1[i].toInt())
            dientesAbajo.add(i, linea2[i].toInt())
        }
        var siNo = "SI"
        var suma = dientesArriba[0] + dientesAbajo[0]
        for (j in 1 .. 5){
            if (suma != dientesArriba[j]+dientesAbajo[j]) siNo = "NO"
        }
        println(siNo)

    }
}

/*
Tiene 106 años y tiene el pelo blanco, de nieve. Tiene un vestido negro y, de madera, negros pendientes. 
Quince hijos parió su duro cuerpo, y trece amamantó del mismo pecho.

Con esta dilatada vida, no es de extrañar que su sonrisa ya no sea lo que era. Aquellos dientes de blanco marfil que 
se adivinan en su foto de boda se han ido mellando y ahora apenas quedan unos pocos en su sitio que a duras penas 
la permiten comer algo que no sea líquido.

Todas las mañanas, con el paso tranquilo, se dirige hacia el espejo y junta los pocos dientes que le quedan arriba 
con los de abajo. Se le endulzan los ojos cuando recuerda su sonrisa de antaño, cómo se juntaban unos con otros formando 
una preciosa muralla blanca. Ahora, según van mellando, a veces la casualidad hace que encajen perfectamente y que pueda 
cerrar la sonrisa sin dejar huecos, mientras que otras veces dos de ellos chocan primero y no permiten que todos los de 
arriba entren en contacto con su pareja de abajo.

Entrada
La entrada estará formada por distintos casos de prueba, cada uno representando la configuración de dientes de un día en 
la vida de la abuela María. El número total de casos aparece en la primera línea de la entrada.

Los casos siguen a continuación, cada uno formado por dos líneas. La primera contiene el alto de los seis dientes 
superiores responsables de la sonrisa (incisivos y caninos) de izquierda a derecha. De forma equivalente, la segunda línea 
contiene la información de los seis inferiores. Todos ellos son números enteros entre 0 y 2.000.

Salida
Para cada caso de prueba se escribirá SI si los dientes de arriba encajan perfectamente con los de abajo y no quedan 
huecos entre ninguno de ellos, o NO en caso contrario.
 */