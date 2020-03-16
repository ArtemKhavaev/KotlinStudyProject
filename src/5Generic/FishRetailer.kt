package `5Generic`

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish{
        println("Sell Cat")
        return Fish("")
    }
}