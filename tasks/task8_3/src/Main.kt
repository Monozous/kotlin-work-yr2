// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val output = fetchData(args[0])
    val lowest = output.minBy { it.second }
    val highest = output.maxBy { it.second }
    val average = averageTemp(output)
    val sorted = output.sortedBy {it.first}.forEach {println(it)}
    println(lowest)
    println(highest)
    println("%.2f".format(average.toFloat()))
}
