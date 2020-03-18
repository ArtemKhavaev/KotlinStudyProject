package `6Lambdas`

import java.lang.invoke.SerializedLambda

typealias DoubleConv = (Double) -> Double
// функция принимающая параметр и лямбду
fun convert(x: Double, converter: (Double) -> Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}
// функция принимающая только лямбду
fun convertFive(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return  result
}
// функция возвращающая лямбду
fun getConversionLambda (str: String) : DoubleConv {
    if (str == "CelsToFahrenheit") {
        return { it * 1.8 + 32}
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}
// функция принимающая и возвращающая лямбду
fun combine (lambda1: DoubleConv, lambda2: DoubleConv) : DoubleConv {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main(args: Array<String>){
    var addFive = { x: Int -> x + 5}
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y}
//    val result = addInts.invoke(6, 7)
    val result = addInts(6, 7)
    println("Pass 6, 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    println("******************************************")

    convert(20.0){ it * 1.8 + 32 }
    convertFive{ it * 1.8 + 32}
    // преобразование в фунты
    println("Convert 2.5 kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    println("******************************************")

    // для ф-ции принимающей и возвращающей лямбды
    // ф-ция принимает две лямбды и создает из них одну

    // определить две лямбды для преобразования
    val kgToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")
    // две лямбды в одну
    val kgsToUSTonsLambda = combine(kgToPoundsLambda, poundsToUSTonsLambda)
    // использование полученной лямбды для преобразования
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")


}