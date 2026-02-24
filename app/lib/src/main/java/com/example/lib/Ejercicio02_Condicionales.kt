package com.pjasoft.lib

// EJERCICIO 2: Condicionales (if / else)
// ========================================
// Dada una lista de calificaciones, clasifica cada una e imprime su nivel:
//   - Reprobado (0-59)
//   - Suficiente (60-69)
//   - Bien (70-79)
//   - Notable (80-89)
//   - Excelente (90-100)
//
// Salida esperada:
// 45 -> Reprobado
// 72 -> Bien
// 91 -> Excelente
// 60 -> Suficiente
// 85 -> Notable

fun main() {
    val calificaciones = listOf(45, 72, 91, 60, 85) //kotlin detecta que es int y si pones decimal tambien detecta
    // Se crea una lista llamada calificaciones.
    // listOf crea una lista fija (no se puede modificar).
    // si quieres asegurar decimal "como forzar": val calificaciones: List<Double> = listOf(45.0, 72.5, 91.3, 60.0, 85.8)

    for (cal in calificaciones) {
        // Recorre cada elemento de la lista.
        // En cada vuelta del ciclo, el número se guarda en la variable cal.

        val nivel = if (cal < 60) {  // Si la calificación es menor que 60
            "Reprobado"
        } else if (cal < 70) {    // Si no fue menor a 60, pero sí es menor a 70 (60-69)
            // TODO: Completa
            "Suficiente"
        } else if (cal < 80) {
            // TODO: Completa
            "Bien"
        } else if (cal < 90) {
            // TODO: Completa
            "Notable"
        } else {   // else: Si no cumple ninguna de las anteriores sera excelente (+90)
            // TODO: Completa
            "Excelente"
        }

        println("$cal -> $nivel")
    }
}
