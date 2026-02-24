package com.pjasoft.lib

// EJERCICIO 4: Bucle for con rangos
// ========================================
// Imprime la tabla de multiplicar del 7 (del 1 al 10).
//
// Salida esperada:
// 7 x 1 = 7
// 7 x 2 = 14
// 7 x 3 = 21
// ...
// 7 x 10 = 70

fun main() {
    val numero = 7   // Guardamos el número del que queremos la tabla

    // TODO: Usa un for con el rango 1..10 e imprime cada linea
    for (i in 1..10) {
        //repetición
        // i va desde 1 hasta 10 ,      1..10 es un rango (incluye el 10)

        // Imprime: "$numero x $i = ${numero * i}"
        println("$numero x $i = ${numero * i}")
        // numero: 7
        // i: el número actual del ciclo
        // numero * i = multiplicación
        // ${} se usa porque es una operación matemática

    }
}


