package com.pjasoft.lib  // Paso 1: Paquete

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

fun main() {   //Paso 2: Inicio del programa

    //Paso 3: Se crea la lista de números a evaluar
    val numeros = listOf(12345, 9081, 100)

    //Paso 4: Se recorre cada numero en la lista con for
    for (n in numeros) {

        // 4.1:Copiamos el numero original en otra variable porque lo vamos a modificar dentro del while
        var numero = n   // Copiamos el valor para poder modificarlo
       //  4.2: Creamos una variable acumuladora aqui iremos sumando los digitos
        var suma = 0   // Variable donde acumularemos la suma

        // TODO: Mientras numero > 0:

        //Paso 5: Mientras el numero sea mayor que 0 el ciclo se repetira
        while (numero > 0) {   // Mientras el número sea mayor que 0 // Completa aqui

            // 5.1: Obtener el ultimo digito usando modulo (% 10)
            // Ejemplo: 12345 % 10 = 5
            suma += numero% 10 // % 10 : obtienes el último dígito. % (modulo/residuo)
            // += suma el valor de la derecha al valor actual de la variable y guarda el resultado.
            // Equivale a: suma = suma + (numero % 10), toma el valor actual de suma y le suma el último dígito de numero, y luego guarda el resultado de nuevo en suma.


            // 5.2: Eliminar el ultimo digito dividiendo entre 10
            // Ejemplo: 12345 / 10 = 1234
            numero /= 10  // divide: /
            // numero / 10: elimina el último dígito  -> 12345 / 10 = 1234
        }

        // Paso 4: Imprimimos el resultado
        println("Suma de digitos de $n: $suma")
    }
}
