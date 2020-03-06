package `1Syntax`

fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGemeChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}
fun  getGemeChoice(optionsParam: Array<String>) = optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    // выполнять цикл пока пользователь не введет валидный вариант
    while (!isValidChoice){
        // собщение пользователю о вводе варианта (предл. варианты - из массива)
        println("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(" .")
        // чтение пользовательского ввода
        val userInput = readLine()
        // проверка пользовательского ввода
        if (userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String
    // определение результата
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    // вывод результата
    println("You chose $userChoice. I chose $gameChoice. $result")
}
