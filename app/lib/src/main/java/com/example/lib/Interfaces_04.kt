package com.pjasoft.lib  //Paso 1: Paquete


// Paso 2: Definimos la interfaz, que solo declara métodos, NO tiene implementación.
// Obliga a las clases que la implementen a definir esos métodos.
interface Figura {

    // 2.1: Método para calcular el área
    fun calcularArea(): Double

    // 2.2 Método para calcular el perímetro
    fun calcularPerimetro(): Double
}


// Paso 3: Clase Rectangulo implementa Figura
// Cuando usamos ":" con una interfaz, estamos diciendo que la clase
// DEBE implementar todos los métodos.
class Rectangulo(val base: Double, val altura: Double) : Figura {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro(): Double {
        // TODO: Perimetro = 2 * (base + altura)
        return 2 * (base + altura)
    }
}


// Paso 4: Clase Circulo implementa Figura
class Circulo(val radio: Double) : Figura {
    override fun calcularArea(): Double {
        // TODO: Area = PI * radio * radio
        return Math.PI * radio * radio  //Math.PI = valor de π ya guardado
    }
    override fun calcularPerimetro(): Double {
        // TODO: Perimetro = 2 * PI * radio
        return 2 * Math.PI * radio
    }
}


// Paso 5: Función principal
fun main() {

    //Paso 6: Crear los objetos (instancias)
    val rect = Rectangulo(5.0, 3.0)
    val circ = Circulo(4.0)

// Paso 7: Imprimimos el resultado
    // "%.2f" significa mostrar solo 2 decimales
    println("Rectangulo - Area: %.2f, Perimetro: %.2f"
        .format(rect.calcularArea(), rect.calcularPerimetro()))

    println("Circulo - Area: %.2f, i: %.2f"
        .format(circ.calcularArea(), circ.calcularPerimetro()))
}

//.format(): sirve para formatear texto, especialmente números.
// % → indica que viene un valor
//.2 → quiero 2 decimales
//f → número decimal (float/double)