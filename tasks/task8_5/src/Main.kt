// Task 8.5: example of using a higher-order function

fun main() {
    val testsString = "This is a String!"

    val vowelCount = testsString.howMany { it.lowercase() in "aeiou" }
    println("$vowelCount vowels found")

    val vowelCountFunction = testsString.count(::isEnglishVowel)
    println("$vowelCountFunction vowels found (function)")
}
