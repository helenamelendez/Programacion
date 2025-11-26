fun copiarLista1(listaO: List<Int>, listaD: MutableList<Int>){
    for (elemento in listaO){
        listaD.add(elemento)
    }
}
fun copiarLista2(listaO: List<Int>):List<Int> {
    var lista2 = listaO.toList()
    return lista2
}

/*
Ya sabemos que para copiar una lista dispongo de las funciones toList() y toMutableList().  
No obstante, ahora queremos practicar el paso de listas como argumentos de una función y 
queremos hacer un par de funciones copiar() "caseras".

De los tests se desprende como tienen que ser estas funciones

 */