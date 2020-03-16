package `4Collections`

data class Recipe(var name: String)
fun main(args: Array<String>){
    var mShoppingList = mutableListOf<String>("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf<String>("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList after items added: $mShoppingList")
    if(mShoppingList.contains("Tea")){
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }
    println("mShoppingList after chenge items: $mShoppingList")
    mShoppingList.sort()
    println("mShoppingList after sort items: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList after revers items: $mShoppingList")
//    mShoppingList.removeAll(extraShopping)
//    println("mShoppingList after removing items: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf<String>("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet after item added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList after copy from Set: $mShoppingList")
    println("size of mShopppingSet is: ${mShoppingSet.size}")
    mShoppingSet.retainAll(moreShopping)
    println("mShoppingSet after retain: $mShoppingSet")

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")
    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap")
    val recipeToAdd = mutableMapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMap after added: $mRecipeMap")
    mRecipeMap.remove("Recipe3", r3)
    mRecipeMap.remove("Recipe1")
    println("mRecipeMap after remove: $mRecipeMap")
    val recipeSet = mRecipeMap.entries
    println("Entries of Map: $recipeSet")
    println("Keys of Map: ${mRecipeMap.keys}")
    println("Entries of Map: ${mRecipeMap.values}")
    println("Item of Map: ${mRecipeMap.get("Recipe5")}")
    println("Item of Map: ${mRecipeMap.get("Recipe1")}")
    try {
        println("Item of Map: ${mRecipeMap.getValue("Recipe1")}")
    }catch(e: NoSuchElementException){
        println("Call NoSuchElementException ")
    }



}