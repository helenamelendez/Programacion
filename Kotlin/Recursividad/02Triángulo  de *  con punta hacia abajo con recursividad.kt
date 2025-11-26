 fun imprimirT(x: Int){
    if (x != 0) {
        imprimirL(x)
        println()
        imprimirT(x-1)
    }
}
fun imprimirL(y: Int){
    if (y != 0){
         print('*')
        imprimirL(y-1)
    }
}


/*
Este problema es para resolver claramente con bucles pero no deja de ser interesante hacer una solución recursiva ya que la recursividad  "se aprecia gráficamente dentro de la figura" y ayuda a razonar la recursividad.

Se trata de prácticar recursidad así que resuelve el problema:

Imprimiendo secuencialmente asterísco a asterisco con caracter '*'. Sin  ayudarte de String, StringBuider o similares.
Sin usar bucles for o while
Ademas de enviar la función imprimirT() puedes enviar funciones adicionales que use tu función imprimirT(), por ejemplo puedes usar una función que te imprima una linea que podría llamarse imprimirL() o similar.

 */