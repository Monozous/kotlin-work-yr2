// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangles: Triangle): Boolean {
    // The test for validity is that each side length should be smaller than the sum of the other two side lengths.
    if ((triangles.first < triangles.second + triangles.third) && (triangles.second < triangles.first + triangles.third) && (triangles.third < triangles.first + triangles.second)) {
        return true
    } else {
        return false
    }
    
}

fun triangleArea(triangle: Triangle): Double {
    var validCheck = isValidTriangle(triangle)

    if (validCheck == false) {
        throw IllegalArgumentException("Not a valid triangle")
    }

    val arg1 = triangle.first.toFloat()
    val arg2 = triangle.second.toFloat()
    val arg3 = triangle.third.toFloat()

    val s = (arg1 + arg2 + arg3) / 2
    val areaBeforeSQRT = (s) * (s-arg1) * (s-arg2) * (s-arg3)
    val area = Math.sqrt(areaBeforeSQRT.toDouble())

    return area
}