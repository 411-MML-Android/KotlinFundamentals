package com.pjasoft.lib //Paso 1: Paquete


// Paso 2: Clase abstracta ,"abstract" significa que NO se puede crear directamente un Vehiculo.
// Solo se puede heredar de ella.
abstract class Vehiculo(val marca: String, val velocidadMaxima: Int) {

    //  2.1: Método abstracto
    // Obliga a las clases hijas a implementarlo.
    abstract fun tipoVehiculo(): String


    // 2.3 : Método normal , Usa polimorfismo porque llama tipoVehiculo(),
    // y cada clase hija devuelve algo diferente.
    fun mostrarInfo() {
        println("${tipoVehiculo()}: $marca — Vel. max: $velocidadMaxima km/h")
    }
}



// Paso 3: Clase Auto
class Auto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {  //heredan vehiculo
    override fun tipoVehiculo() = "Auto"   //Implementan tipovehiculo
}


// TODO: Crea Moto y Camion de forma similar
// Paso 4: Clase Moto
class Moto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {

    override fun tipoVehiculo() = "Moto"
}


// Paso 6: Clase Camion
class Camion(marca: String, velMax: Int) : Vehiculo(marca, velMax) {

    override fun tipoVehiculo() = "Camion"
}

// Paso 7: Función principal
fun main() {
    // Lista de tipo Vehiculo
    val vehiculos: List<Vehiculo> = listOf(   //vehiculos variable de la lista
        Auto("Toyota", 180),
        Moto("Honda", 220),
        Camion("Volvo", 120)
    )
    // TODO: Recorre la lista y llama mostrarInfo() en cada vehículo
    // Paso 8: Recorremos la lista
    // "vehiculo" es de tipo Vehiculo,
    // pero Kotlin ejecuta el tipo real (Auto, Moto, Camion)
    for (vehiculo in vehiculos) {  //vehiculo → variable temporal que guarda cada elemento

        vehiculo.mostrarInfo()  // Paso 8: Imprimimos el resultado
    }
}
