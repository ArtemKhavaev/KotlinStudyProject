package `3OOP`

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 20

    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("The Animal is roaming")
    }
    fun sleep(){
        println("The Animal is sleeping")
    }

}