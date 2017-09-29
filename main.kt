
fun main(args:Array<String>) {
    // validar si un objeto pertenece a una clase o no
    obtenerTam("Hola")
    obtenerTam(1)
}

fun obtenerTam(obj:Any) {

    if( obj is String ) {
        println(obj.length)
    } else {
        println("No es una cadena")
    }

}