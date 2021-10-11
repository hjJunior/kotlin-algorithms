fun main() {
    val oddNumber = 7
    val evenNumber = 8

    printResult(oddNumber)
    printResult(evenNumber)
}

fun isEven(number: Int) = number % 2 == 0

fun printResult(number: Int) = println(
    when (isEven(number)) {
        true -> "The $number is even"
        false -> "The $number is odd"
    }
)
