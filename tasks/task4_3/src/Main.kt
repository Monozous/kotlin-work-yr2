// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    
    if (args.size != 3) {
        println("Enter 3 Arguments")
    }

    val average = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble()) / 3


    when (average.roundToInt()) {
        in 70..100 -> println("Distinction")
        in 40..69  -> println("Pass")
        in 0..39   -> println("Fail")
        else       -> println("?")
    }
}