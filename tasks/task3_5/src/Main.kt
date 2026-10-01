// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("src/test.txt")
    val content = "My name is Sam"
    filePath.appendText("His name was bolahan")

    println("${filePath.readText()}")
}
