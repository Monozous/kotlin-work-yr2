// Task 4.2: use of if and ranges

fun main() {
    println(
"""
PIZZA MENU

(A) Margherita
(B) Quattro Stagioni
(C) Seafood
(D) Hawaiian
            
Choose your pizza (A-D): """)

    var pizzaChoice = readln().lowercase()

    if (pizzaChoice.length != 1) {
        println("Enter required option")
    } else {
        if (pizzaChoice in "a".."d") {
            println("Order Accepted")
        } else {
            println("Invalid Order")
        }
    }
}
