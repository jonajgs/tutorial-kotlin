
fun main(args:Array<String>) {

    // array with multiples values of types
    val arreglo:Array<Any> = arrayOf(1,2,3,4,5,6,7,8,9,10,"11","12","trece")

    val arregloDeInt:IntArray = intArrayOf(1, 2, 3)

    val arregloDeNulos = arrayOfNulls<String>(12) // todos son nulls

    // elemento es una variable de asignacion
    for( elemento in arreglo ) {
        print("$elemento - ")
    }

    println("")

    for( indice in arreglo.indices ) {
        print(arreglo[indice])
        print(" - ")
    }

}