// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int): String {
    when (mark) {
        in 0..39   -> return "Fail"
        in 40..69  -> return "Pass"
        in 70..100 -> return "Distinction"
        else       -> return "?"
    }
}

fun main (args: Array<String>) {
    val iterationSize = args.size - 1
    
    for (n in 0..iterationSize) {
        var temp = args[n].toInt()
        var graded = grade(temp)
        println("$temp is a $graded")
    }
}