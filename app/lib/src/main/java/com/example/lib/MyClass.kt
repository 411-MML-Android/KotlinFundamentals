package com.pjasoft.lib

/*1 Crea un programa, que tenga un precio de comida y un porcentaje de propina.
e imprimir cuanto es el total a pagar
 */
//String Interpolation
//Null safety: proteje de esos errores. no uedes ejecutar algo que no exixte
//Hilo: espacio donde corre tu programa, hilo principal. puede correr varios al mismo tiempo

fun main() {
    println("Hola mundo")

    //1. acostumbrate a usar val
    val price: Double = 150.0
    val percentage: Double = 0.10
    val tip: Double = price * percentage
    val total: Double = price + tip
    println("El costo de la comida es:  $$total")


    //2. El portero de la discoteca, verifica que una persona pueda entrar en el disco
    //Solo si es mayor de edad
    //string? : es string o nulo

//    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
//    if (age == null) {
//        println("El numero que pusiste pa, no es un numero entero, insertalo bien!!")
//    } else if (age > 18) {
//        println("Eres mayor edad, pasale a la discoteca")
//    } else {
//        println("No puedes pasar")
//    }

    //FOR
    //ctl k ctrl c  /q
    for (i in 1..10) {
        println(i)
    }

    //cilclo al reves
    for (i in 10 downTo 2)
        println(i)


    for (i in 100 downTo 0 step 10 )


//WHEN
when(age){
    null -> println("Ingresa un numero valido")
    in 18 .. Integer.MAX_VALUE -> println("Entrale")
    else -> println("No puedes pasar")

}

var counter : Int = 12
while(counter <20){
    println("El contador es menor que 20")
    counter++
}

//DO WHILE : ejecuta primero el bloque de codigo y despues evalua la condicion
//operadores logicos: && ||
// operador aritmetico + - * %
do{
    println("El contador vale menos de 30")
    counter++
}
while(counter <30)

}

//Determinar si un numero ingresado por el usuario es un numero primo
// git init, git status. git add .
