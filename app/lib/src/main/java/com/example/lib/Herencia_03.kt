package com.example.lib //Paso 1: Paquete


// Paso 2: Clase base
// "open" permite que otras clases puedan heredar de ella
open class Animal(val nombre: String, val edad: Int){  // En Kotlin, si NO pones open, nadie puede heredar esta clase.

    // Paso 3: Método que puede ser sobrescrito
    // "open" aquí significa que las clases hijas pueden modificar este método.
    open fun hacerSonido(){
        println("Sonido genérico")
    }

    // Paso 4: Método normal (no se puede sobrescribir porque no es open)
    // Como NO tiene "open", las clases hijas NO pueden modificarlo.
    fun describir(){
        println("Soy $nombre y tengo $edad anos")
    }

}


//CLASE PERRO
// Paso 5: Clase Perro hereda de Animal
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Guau!")
    }
}


//CLASE GATO
// Paso 6: Clase Gato hereda de Animal
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {

    override fun hacerSonido() {
        println("¡Miau!")
    }
}


//CLASE VACA
// Paso 7: Clase Vaca hereda de Animal
class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {

    override fun hacerSonido() {
        println("¡Mu!")
    }
}


// Paso 8: Función principal
fun main(){

    // Paso 9: Imprimimos el resultado
    //Perro
    val perro = Perro("Rex", 3)
    perro.describir()
    perro.hacerSonido()

    //Gato
    val gato = Gato("Michi", 2)
    gato.describir()
    gato.hacerSonido()

    //Vaca
    val vaca = Vaca("Lola", 5)
    vaca.describir()
    vaca.hacerSonido()

}