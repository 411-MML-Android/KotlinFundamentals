package com.pjasoft.lib  // Paso 1: Defino el paquete



// Paso 2: Creo la clase CuentaBancaria donde esta clase representará una cuenta con un titular y un saldo
class CuentaBancaria (val titular: String){
    // 2.2: Declaro la propiedad saldo : Empieza en 0.0
    var saldo: Double = 0.0


    // Paso 3: Creo el método depositar
    fun depositar (cantidad: Double){
        //TODO
        // 3.1: Sumo la cantidad al saldo actual
        saldo += cantidad  //saldo = saldo + cantidad
        // 3.2 : Imprimo el nuevo saldo
        println("Deposito realizado. Nuevo saldo: $saldo")


    }
    // Paso 4: Creo el método retirar
    fun retirar (cantidad: Double){
        //TODO: verifica que haya saldo suficiente
        if (saldo >= cantidad) {
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        }else{
            println("Saldo insuficiente")
        }
    }

    // Paso 5: Método para mostrar el saldo actual
    fun mostrarSaldo(){
        //TODO
        println("El saldo actual de $titular es: $saldo")
    }
}


// Paso 6: Función principal donde se ejecuta el programa
fun main(){
    // 7 : Creo un objeto cuenta
    // Paso 7.1: Imprimimos el resultado
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)  //NO DEBE PERMITIRLO

    cuenta.mostrarSaldo()
}