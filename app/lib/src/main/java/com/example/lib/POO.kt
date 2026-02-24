package com.pjasoft.lib

// PRINPICIOS POO: Paradigma de programacion proposito modelar objetos de la vida real
//que si quiero interactuar con la botella puedo hacerla. codigo real a codigo y utiliza clases
// A PIE
// HERENCIA
// POLIMORFISMO
// ENCAPSULAMIENTO
// ABSTRACCION
class Person(val name : String, val age : Int){
    // EN JAVA
//    String name;
//    Int age;
//
//    public Int GetName(){
//        return this.name
//    }
//
//    public Person(String name, Int age){
//        this.name = name;
//        this.age = age;
//    }
    fun sayHello(){
        println("Hola soy $name y tengo $age")
    }
}

// ABSTRACCION
// Modelas SOLO LO IMPORTANTE
// La diferencia principal entre una clase normal y una abstracta
// es que las abstractas NOOOO PUEDEN instanciar objetos...
abstract class Shape(val sides : Int){
    abstract fun calculateArea() : Double
}

class Circle(val radius : Double) : Shape(360){
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }
}

class Square(val side : Double) : Shape(4){
    override fun calculateArea(): Double {
        return side * side
    }
}
// METODOS EN KOTLIN
/*
* se definen con fun
* paara regresar un dato se utliza : Tipo de Dato
* fun calcularArea() : Double{
*       return 1.0
* }
*
* */
// QUE ES UNA INTERFAZ GRAFICA???
// Una interfaz es un CONTRATO
// PRINCIPIOS SOLID
interface Ave{
    fun fly()
    fun poop()
    fun peep()
    fun coito()
}

class Eagle : Ave {
    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun poop() {
        TODO("Not yet implemented")
    }

    override fun peep() {
        TODO("Not yet implemented")
    }

    override fun coito() {
        TODO("Not yet implemented")
    }

}


open class Animal(val name : String){
    open fun makeSound(){
        println("$name esta haciendo un sonido")
    }
}

class Dog : Animal(name = "Bonnie"){

}

class Cat(val catName : String) : Animal(name = catName){
    fun trepar(stairs:Int,place:String){
        println("$name trepo $stairs escalones en $place")
    }
}


fun main(){
    val persona = Person("Juan Frausto",28)
    val persona2 = Person(age = 29,name = "Juan Frausto")
    val animal = Animal("Animal generico")
    val cat = Cat("Coco")
    cat.trepar(3,"La Salle")
    persona.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona.name}")

    val square1 = Square(side = 34.5)
    val square2 = Square(side = 12.3)
    val circle = Circle(radius = 10.0)
    val shapes = listOf<Shape>(square1,square2,circle)
    for(shape in shapes){
        println(shape.calculateArea())
    }
}