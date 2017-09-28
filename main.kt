
fun main(args:Array<String>) {

    // condiciones
    var baconPrice:Int = 14

    if( baconPrice > 14 ) {
        println("No m alcanza para el tocino :(")
    } else {
        println("Me da el tocino, porfavor!!")
    }

    // another way -> like a ternary
    val response:String = if( baconPrice > 14 ) "No m alcanza para el tocino :(" else "Me da el tocino, porfavor!!"

    println(response)

}