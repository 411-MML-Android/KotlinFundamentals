package com.pjasoft.lib  //Paso 1: define clase

//Paso 2 : define la clase donde ponemos 3 propiedades
class Persona (val nombre: String, val edad: Int, val ciudad: String) {


    //Paso 3: Creo metodo saludar que esto solo imprime saludo, nombre, ciudad
    fun saludar(){
        //TODO: Imprime el saludo
        println("Hola me llamo $nombre y tengo $edad anos")
    }

    //Paso 4: Crea metodo esMayorDeEdad que solo devuelve true/false
    fun esMayorDeEdad() : Boolean {
        //// 4.4  Comparo si la edad es mayor o igual a 18
         // Si edad >= 18 devuelve true
        // Si edad < 18 devuelve false
        //TODO: Regresa true si edad >=18
        return edad >=18  //Los operadores de comparación SIEMPRE devuelven Boolean
    }
}

// Paso 5 : Creo la función principal donde se ejecuta el programa
fun main(){
    // Paso 6: Creo el primer objeto persona1/2
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")
    //TODO: Llama los metodos de cada persona

    // Paso 7: Llamo al método saludar de persona
    // Paso 8: Imprimimos el resultado
    //PERSONA 1
    persona1.saludar()
    println("${persona1.nombre} es mayor de edad: ${persona1.esMayorDeEdad()}")
    //PERSONA 2
    persona2.saludar()
    println("${persona2.nombre} es mayor de edad: ${persona2.esMayorDeEdad()}")
}