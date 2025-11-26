fun main() {
    var entrada1 = readln().toInt()
    while (entrada1 != 0) {
        var entrada2 = readln().split(" ")
        var varLisMut = mutableListOf<Int>()
        for (Indice in 0 .. entrada2.lastIndex){
        varLisMut.add(Indice, entrada2[Indice].toInt())
        }
        varLisMut.sort()
        var resultado = 0
        if (entrada1%2 == 0){
            for (Indice in 0 until entrada1)
                if (Indice == (entrada1/2)-1 || Indice == entrada1/2) {
                    resultado = resultado + varLisMut[Indice]
                }

        }
        else{
            for (Indice in 0 until entrada1)
                if (Indice == (entrada1/2)) {
                    resultado = resultado + varLisMut[Indice]*2
                }

        }
        println(resultado)

        entrada1 = readln().toInt()
    }
}


/*
Dado un conjunto (o muestra) de valores positivos ordenados, se define la mediana como el valor que ocupa la posición 
central de los datos dados:



En el caso de tener un número impar de valores, la mediana está clara: será aquel valor que tenga el mismo número de 
valores más pequeños y más grandes que él en la muestra. En el caso de tener un número par de valores, habría dos 
candidatos a ser mediana. En vez de decidirnos por uno, en este caso la mediana viene dada por la media aritmética de 
esos dos valores que ocupan las posiciones centrales.

Dada una colección de números positivos, nos piden calcular la mediana. Para evitar tener que trabajar con números 
decimales en algunos casos, habrá que calcular su doble.

Entrada
La entrada consta de una serie de casos de prueba. Cada uno comienza con un número, menor o igual que 25.000, que indica 
la cantidad de valores que tiene la muestra. A continuación se dan los valores de la muestra, todos números enteros 
positivos, de los que habrá que calcular la mediana multiplicada por dos.

La entrada terminará con una serie de 0 valores.

Salida
Para cada caso de prueba se mostrará el doble de la mediana de los valores dados.
 */