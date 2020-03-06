package `1Syntax`

fun main(args: Array<String>){
    //This is comment коментарии

    // вывод текста
    print ("Piw!")// без переноса строки
    println ("Pow!")// с переносом строки

    // выполнение действий
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x")

    // ветвления
    val a = 3
    val b = 1
    if (a > b ) println ("a is greater than b ")
    else println ("b is greather than a ")
    // данный код можно записать используя if как выражение
    println(if (a > b)"a is greater than b " else  "b is greather than a ")

    //циклы
    var z = 1
    println ("Before the loop x = $z")
    while (z < 4){
        println("In the while loop z = $z")
        z = z + 1
    }
    println("After the while loop z = $z")
    do {
        z  = z - 1
        println("In the do-while loop z = $z")
    } while (z > 1)


    for (i in 1..10){
        x = x + 1
        print (" x is now $x ")
    }









}