package `5Generic`

class Vet <T: Pet> {
    fun treat(t: T){
        println("Treat Pet ${t.name}")
    }
}

