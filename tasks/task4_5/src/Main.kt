// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // args[0] = LIMIT
    val limit = args[0].toInt()
    var sum = 0
    for (x in 1..limit step 2) {
      sum += x
    }
    println(sum)
}
