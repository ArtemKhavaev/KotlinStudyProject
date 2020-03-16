package `5Generic`

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog{
        println("Sell Cat")
        return Dog("")
    }
}