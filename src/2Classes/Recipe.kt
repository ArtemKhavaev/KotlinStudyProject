package `2Classes`

data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy"){

}
class Mushroom(val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean) : this(0, isMagic_param){
        // код вторичного конструктора
    }
}
fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
    // some code
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}
fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}
fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}

fun main(args: Array<String>){
    var r1 = Recipe("Thai Curry", "Chicken")
    var r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken")
    var r3 = r1.copy(title = "Chicken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")//295805076
    println("r2 hash code: ${r2.hashCode()}")//295805076
    println("r3 hash code: ${r3.hashCode()}")//1459025056
    println("r1 toString: ${r1.toString()}")//r1 toString: Recipe(title=Thai Curry, mainIngredient=Chicken, isVegetarian=false, difficulty=Easy)
    println("r1 == r2? ${r1 == r2}")//true
    println("r1 === r2? ${r1 === r2}")//false
    println("r1 == r3? ${r1 == r3}")//false
    val (title, mainIngredient, vegeterian, difficulty) = r1 // деструктуризация
    println("title is $title and vegetarian is $vegeterian")

    val m1 = Mushroom(6, false)// создание объекта через первичный когнструктор
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")

    val m2 = Mushroom(true)// создание объекта через вторичный конструктор
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2, 5)) // вызов Int - версии addNumbers
    println(addNumbers(2.3, 5.6)) // вызов Double - версии addNumbers





}
