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

    println("Pon una edad")
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
    //ctl k ctrl c  /q   cometar/descomentar
    for (i in 1..10) {
        println(i)
    }

    //cilclo al reves
    for (i in 10 downTo 2)
        println(i)


    for (i in 100 downTo 0 step 10)


//WHEN
        when (age) {
            null -> println("Ingresa un numero valido")
            in 18..Integer.MAX_VALUE -> println("Entrale")
            else -> println("No puedes pasar")

        }

    var counter: Int = 12
    while (counter < 20) {
        println("El contador es menor que 20")
        counter++
    }

//DO WHILE : ejecuta primero el bloque de codigo y despues evalua la condicion
//operadores logicos: && ||
// operador aritmetico + - * %
    do {
        println("El contador vale menos de 30")
        counter++
    } while (counter < 30)


}

/*
//Determinar si un numero ingresado por el usuario es un numero primo

// 1️. Pedir número al usuario
    println("Ingresa un número para verificar si es primo:")
    val input = readlnOrNull()               // Lee lo que escribe el usuario (puede ser null)
    val number = input?.toIntOrNull()        // Convierte a Int, si no es número queda null

    // 2️. Revisar si es un número válido
    if(number == null){
        println("No ingresaste un número válido")
    } else if(number < 2){
        println("$number no es primo")      // 0 y 1 nunca son primos
    } else {
        // 3. Revisar divisores
        var esPrimo = true
        for(i in 2 until number){           // Recorre del 2 hasta number-1
            if(number % i == 0){           // Si se divide exactamente por algún número
                esPrimo = false
                break                        // Sale del bucle, ya sabemos que no es primo
            }
        }

        // 4. Mostrar resultado
        if(esPrimo){
            println("$number es primo")
        } else {
            println("$number no es primo")
        }
    }
}
*/




//como sacar un archivo del stage/limbo
// git init: inicias el proyecto
// git remote add origin( origin tu lo deciedes?) despues enklazas https...
// , git status. git add .
// branch main: para que archivos se han  modifucado
//git restore --stagged
        //git status
//agrega git add, git commit -m "comentario que quieres"
//se te olvido 1. ejemplo malo git status  git add git commit   ...
//2. realiza esta git status,  git add, git commit --amend para mover con i y para salir esc:wq

//ultimo cambio



//agrega git add, git commit -m "comentario que quieres" git puch origin main
//se subio algo que no queria como lo quito
//1. git log, copias commit pones q y te sales
//git log
//git  reset --herd /lo que copiaste

//cuando todo se rompe
//git log
//git push origin main
//git push origin main --force

//git reflog            //consejo haz commit pero es mala practica?
//copias el id que quiere borrar git reset --hard id
//buena practica solo en EMERGENCIAS, esmalo commit estas borrando la historia del repositorio para
//saber que se hace. lo arregals con git log para ver el historial
//agarro el git que quiero revertir asi que ciopio
//git revert y hash que copiaste
//sales esc:wq
//git pust origin main . ya y si pones como odio mi jefe es mejor que hagas un reset

//val variable
//val testing //vval nose


//git status
//git add hash
//git commit -m "agregando variables, no acabe"
//git log , git reset --soft  hash        --soft deja cambios no los borra deja en limbo. hard elimmina completo
//git add hash
//git commit -m "variables"
//git push origin main


//quieres ver quien arruino , lo chasheo y buscar quien hizo cada cosa
//en la terminal se ve git blame app  hash (veras linea por linea )


// copia de la rama de main: 1. git branch , git checkout -b feaure/login, sales git chechou main, regresas a main
//git switch -c feature/register
//2.git branch, git status, git add hash, git commit -m"funcionalidas de registro", gir add hasg,  git commit -m"api"
//git add hash, git commit -m"interfaz grafica",
//git log (debes de tene r 3 commit)
//no recomiendan hacer local pero se hace : te vas a la rama donde quieres los cambios, git switch main, para traerte los cambios git merge feature/register(nombre de la rama)
//git push 7 origin main


//cambio de rama
//git switch feature/login

//git put origin main
//git add hash, git commit -m "login",x2 api y ui
//mandar a repositorio remoto git push feature/login (te crea una nueva rama
//pull request;es ams facil que el resaearch?
//MARKDOWN

//git pull  origin main
//creas otra rama git switch -c feature/inicio,

//quiere la interfaz ya el jefe pero falta que haces
// git add hash. git commit -m "creando interfaz" ,git push origin feature/inicio . x2 conexion api
//git log( interfaz), git switch main, git switch feature//inicio,ahora con main x2 sigue git cherry-pick hash,
// //git push origin main sigo lo que me falta y la api y todo y hago un  merge
//es mala practica el cherry-pick