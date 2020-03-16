package `5Generic`

abstract class Pet (var name: String)

fun main (args: Array<String>){
    val catOne = Cat("Fuzz")
    val catTwo = Cat("Katsu")
    val fishFunny = Fish("Funny")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catOne)
    petVet.treat(catTwo)
    fishVet.treat(fishFunny)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catOne, 20)
    catContest.addScore(catTwo, 50)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catOne, 20)
    petContest.addScore(fishFunny, 30)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}