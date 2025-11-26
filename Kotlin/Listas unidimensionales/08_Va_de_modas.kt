fun main(){
   var caso = readln().toInt()
    while (caso != 0){
        var list = readln().split( " ")
        var valorActual = list[0].toInt()
        var valores = mutableListOf<Int>(0,0,valorActual)
        for (i in 1 until caso){
            if (list[i].toInt() == valorActual) {
                valores[0]++
                if (i == caso-1) {
                    if (valores[0] > valores[1]) {
                        valores[2] = valorActual
                    }
                    valorActual = list[i].toInt()
                }
            }
            else{
                if (valores[0] > valores[1]) {
                    valores[1] = valores[0]
                    valores[2] = valorActual
                }
                valorActual = list[i].toInt()
                valores[0] = 0
            }


        }
        println(valores[2])
        caso = readln().toInt()
    }
}

/*
Dado un conjunto, o distribución, de valores se define la moda como el valor (o valores) que más se repite en dicho conjunto.

En este problema te pedimos que calcules la moda de un conjunto de números.

Entrada
La entrada consta de una serie de casos de prueba.

Cada caso comienza con un número que representa el número de valores que tiene el conjunto, que nunca será mayor de 25.000. 
En la siguiente línea se proporcionan, separados por espacio, los valores de todos los elementos del conjunto. Todos 
ellos serán números enteros.

La entrada terminará con una serie de 0 valores.

Salida
Para cada caso de prueba se mostrará la moda de la distribución, es decir el número que más se repite.

Se garantiza que ningún caso de prueba contendrá más de una moda, es decir únicamente habrá un valor que aparezca el 
mayor número de veces.
 */