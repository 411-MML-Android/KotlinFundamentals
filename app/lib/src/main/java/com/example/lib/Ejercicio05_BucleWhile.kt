package com.pjasoft.lib

// EJERCICIO 5: Bucle while
// ========================================
// Dado un numero, calcula la suma de sus digitos usando while.
// Mientras el numero sea mayor a 0, extrae el ultimo digito con % 10
// y reduce el numero con / 10.
//
// Salida esperada:
// Suma de digitos de 12345: 15
// Suma de digitos de 9081: 18
// Suma de digitos de 100: 1

fun main() {
    val numeros = listOf(12345, 9081, 100)

    for (n in numeros) {
        var numero = n   // Copiamos el valor para poder modificarlo
        var suma = 0   // Variable donde acumularemos la suma

        // TODO: Mientras numero > 0:

        while (numero > 0) {   // Mientras el número sea mayor que 0
            // Completa aqui
            suma += numero% 10 // % 10 : obtienes el último dígito. % (modulo/residuo)
            // += suma el valor de la derecha al valor actual de la variable y guarda el resultado.
            // Equivale a: suma = suma + (numero % 10), toma el valor actual de suma y le suma el último dígito de numero, y luego guarda el resultado de nuevo en suma.
            numero /= 10  // divide: /
            // numero / 10: elimina el último dígito  -> 12345 / 10 = 1234
        }

        println("Suma de digitos de $n: $suma")
    }
}
