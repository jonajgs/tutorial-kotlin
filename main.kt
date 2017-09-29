
fun main(args:Array<String>) {


    //castear("Hola")
    //castear(1)
    castSecure("Hola")
    castSecure(1)


}

fun castear(obj:Any) {

    // peligroso, operados de casteo peligroso (as)
    // pero si el objeto que recibimos es un Int u otra clase, dara una excepcion
    val cadena:String = obj as String
    println(cadena.length)
}

fun castSecure(obj:Any) {
    val cadena:String? = obj as? String
    println(cadena?.length)
}
