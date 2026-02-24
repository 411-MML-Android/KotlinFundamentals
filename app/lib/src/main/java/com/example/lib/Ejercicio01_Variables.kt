package com.pjasoft.lib

// EJERCICIO 1: Variables y Tipos de Datos
// ==========================================
// Declara las siguientes variables con los valores indicados:
// - nombre: "Carlos" (String)
// - edad: 21 (Int)
// - estatura: 1.78 (Double)
// - esEstudiante: true (Boolean)
//
// Imprime un mensaje que diga:
// "Me llamo Carlos, tengo 21 años, mido 1.78m y es true que soy estudiante."
// Usa string templates ($variable) para construir el mensaje.

fun main() {          //donde inicia el programa
    // val significa que no puede cambiar.
    val nombre: String = "Carlos"    // Declaramos una variable llamada nombre.
    val edad: Int = 21  // Int: número entero.
    val estatura: Double = 1.78   // Double: número decimal.
    val esEstudiante: Boolean = true

    // TODO: Usa println con string templates para imprimir el mensaje
    println("Me llamo $nombre, tengo $edad anos, mido ${estatura}m y es $esEstudiante que soy estudiante.")

    // $ = mete la variable aquí
    // $nombre inserta el valor de la variable nombre.
    //Se usan llaves porque después va la letra m.
}

