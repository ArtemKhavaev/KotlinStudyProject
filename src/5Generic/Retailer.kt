package `5Generic`

interface Retailer<out T> {
    fun sell(): T
}