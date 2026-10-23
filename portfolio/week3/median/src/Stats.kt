// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    if (data.isEmpty()) {
        throw IllegalArgumentException("Empty List Given")
    }

    val sortedArray = data.sorted()
    val size = sortedArray.size

    val mod = size % 2

    if (size % 2 == 0) {
        var median = (sortedArray[(size - 1) / 2] + sortedArray[((size - 1) / 2) + 1]) / 2
        return median
    } else {
        var median = sortedArray[(size - 1) / 2]
        return median
    }

}