package `3OOP`

class Main{

}
    fun main(args: Array<String>){
        val animals = arrayOf(Hippo(), Wolf())
        for (item in animals){
            item.makeNoise()
            item.eat()
        }

        val vet = Vet()
        val wolf = Wolf()
        val hippo = Hippo()
        vet.giveShot(wolf)
        vet.giveShot(hippo)

        val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
        for (item in roamables){
            item.roam()
            if(item is Animal){
                item.eat()
            }
        }


    }
