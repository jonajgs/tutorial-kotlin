
fun main(args:Array<String>) {

    // condiciones
    var baconPrice:Int = 15

    when( baconPrice ) {

        14 -> println("Dame todo el tocino")
        15,16,17 -> println("Deja ir por un pesito a mi casa")
        else -> println("Gracias")

    }
}