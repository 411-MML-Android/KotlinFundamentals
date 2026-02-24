package com.pjasoft.lib

fun main(){
    //T:tipos genericos((string,double...)
    //foreach
    //for(i in 1..2){ }
    //las listOf : son de tamaño fijo
    //menus
    val numbers = listOf<Int>(10,20,560,900,24,86)
    val dynamicNumber = mutableListOf(2,85,12,69,1)

    var maxNumber = numbers[0]
    for(number in numbers){
        if(number > maxNumber){
            //Siempre declara en inmutable y ya lo cambias
            maxNumber = number
        }
        println(number)
    }
}

