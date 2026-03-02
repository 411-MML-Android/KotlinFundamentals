package com.pjasoft.lib  //Paso 1: Paquete

// EJERCICIO 3: Expresion when
// ========================================
// Dada una lista de numeros del 1 al 7, convierte cada uno al nombre
// del dia de la semana usando "when".
// Si el numero no esta en el rango 1-7, imprime "Dia no valido".
//
// 1 = Lunes, 2 = Martes, 3 = Miercoles, 4 = Jueves,
// 5 = Viernes, 6 = Sabado, 7 = Domingo
//
// Salida esperada:
// 1 -> Lunes
// 4 -> Jueves
// 7 -> Domingo
// 9 -> Dia no valido

fun main() {    //Paso 2: Inicio del programa

    // Paso 3: Creamos la lista de números a evaluar
    val dias = listOf(1, 4, 7, 9, 3, 6)

    // Paso 4: Recorremos la lista con un for
    for (d in dias) {
        // Paso 5: Usamos la expresión when
        // "when" funciona como un switch mejorado.
        val nombre = when (d) {
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            // TODO: Completa los dias restantes (4-7) y el else
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "Dia no valido"  // Si no es 1-7 es día inválido
        }

        // Paso 4: Imprimimos el resultado
        println("$d -> $nombre")
    }
}
