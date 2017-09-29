
fun main(args:Array<String>) {

    // nullables
    // la variable pizza es nullable string
    var pizza:String? = "Pizza"

    // val rebanadas = pizza.length// esto me da error, ya que kotlin no esta seguro que cotiene algo la variable

    // primera manera
    if(pizza != null) {
        val rebanadas = pizza.length
        println("Tengo ${rebanadas} de ${pizza}")
    } else {
        println("No queda pizza")
    }

    // segunda manera
    // safe all operator, operador de llamada segura
    val rebanadas2 = pizza?.length
    // comment or uncomment the line of bellow
    pizza = null
    println("Tengo ${rebanadas2} de ${pizza}")

    // tercera manera
    // Operador !!
    var pizzaHut:String? = "PizzaHut"
    // uncomment or comment to get a nullPointerException
    // pizzaHut = null
    var rebanadasDePizza:Int? = pizzaHut!!.length

    println("${pizzaHut} tiene ${rebanadasDePizza} rebanadas de pizza aun")




}