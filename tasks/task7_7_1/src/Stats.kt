// Task 7.7.1: statistics functions

fun calculateMedian(data: List<Float>) {
    val sortedArray = data.sorted()
    
    val size = sortedArray.size
    println(sortedArray)
    val mod = size % 2


    if (size % 2 == 0) {
        var median = (sortedArray[(size - 1) / 2] + sortedArray[((size - 1) / 2) + 1]) / 2
        println(median)
    } else {
        var median = sortedArray[(size - 1) / 2]
        println(median)
    }

}