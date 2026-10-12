// Task 5.1.2: main program
fun main(args: Array<String>) {
    val arguments = args[0].split("d").toTypedArray()
    
    for (n in 1..arguments[0].toInt()) {
        var rolls = rollDie(arguments[1].toInt())
    }

}