
fun main(args:Array<String>) {

    val a = 2
    val b = 2
    println("La suma de ${a} + ${b} = ${suma(a,b)}")

    // parametros por nombre, aunque los parametros esten voltiados siguen funcionando
    println("La division de ${a} + ${b} = ${division(num2 = b,num1 = a)}")

    saludos(nombre = "Aldo")
    saludos()

    // funcioens de extension
    val numeros = intArrayOf(1,2,3,4,5,6)
    numeros.swap(indice1 = 1, indice2 = 3)

    println("Numeros: ")
    for(numero in numeros) {
        println(numero)
    }

    // funciones Infix
    // println(5.menos(4))
    // tiene restricciones
    // 1. tiene que ser miembro de una clase  o ser funciones de extension
    // 2. deben tener solamente un parametro
    // 3. deben de estar marcadas por la palabra reservada infix
    val resultado = 5 menos 4
    println("El resultado es: ${resultado}")
}

// function to return a integer
fun suma(num1:Int, num2:Int):Int {
    return num1 + num2
}

// function to is a voids
// but is not necesary put it
fun functionVoid():Unit {
    println("this is a function that not return nothing")
}

// functiones en una sola linea
fun sumaEnUnaLinea(num1:Int, num2:Int):Int = num1 + num2

// parametros por nombre
fun division( num1:Int, num2:Int ) = num1 / num2

// parametros por defecto
fun saludos( nombre:String = "Desconocido" ) = println("Hola ${nombre}")

// funciones de extesion
fun IntArray.swap(indice1:Int, indice2:Int) {
    val temp = this[indice1];

    this[indice1] = this[indice2]
    this[indice2] = temp
}

// funciones Infix
infix fun Int.menos(number:Int) = this - number
