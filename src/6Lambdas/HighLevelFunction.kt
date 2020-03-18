package `6Lambdas`

data class Grocery (
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int)

fun main(args: Array<String>) {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 2),
        Grocery("IceCream", "Frozen", "Pack", 3.0, 2)
    )

    // определение максимального, минимального элемента коллекции по значению
    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    // определение суммы элементов коллекции по заданному свойству
    val sumQuantity = groceries.sumBy { it.quantity }
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")

    //отфильтровать по критерию (List)
    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    //преобразование элементов коллекции (List)
    val groceryNames = groceries.map { it.name }
    println("groceryNames: $groceryNames")
    val halfUnitsPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitsPrice : $halfUnitsPrice")

    // цепочки вызовов функций
    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    // forEach  перебор элементов коллекции
    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unitPrice > 3.0: ")
    groceries.filter { it.unitPrice > 3.0 }.forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach({ itemNames += "${it.name} " })
    println("itemNames: $itemNames")

    // группировка по категориям
    groceries.groupBy { it.category }.forEach{
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }

    // обработка через fold
    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item}
    println("productsOfInts: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("mames: $names")

    val changeFrom50 = groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println("changeFrom 50: $changeFrom50")

}



