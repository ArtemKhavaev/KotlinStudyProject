package `2Classes`

class Rectangle (var width: Int, var height: Int){
    val isSquare: Boolean
    get() = (width == height)

    val area: Int
    get() = (width*height)


}
fun main (args: Array<String>){
    val r = arrayOf(Rectangle(1, 1), Rectangle(1, 3),
        Rectangle(2, 1), Rectangle(2,2))
    for (x in 0..3){
        print("Rectangle $x  has area ${r[x].area} ")
        println("It is${if (r[x].isSquare) "" else " not"} a square")
    }
}