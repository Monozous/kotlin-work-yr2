// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess


fun main (args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    
    
    val arg1 = args[0].toFloat()
    val arg2 = args[1].toFloat()
    val arg3 = args[2].toFloat()

    val s = (arg1 + arg2 + arg3) / 2
    val areaBeforeSQRT = (s) * (s-arg1) * (s-arg2) * (s-arg3)
    val area = Math.sqrt(areaBeforeSQRT.toDouble())

    println("Area = %.5f".format(area))
    
}