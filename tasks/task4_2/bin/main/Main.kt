// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU (a) Margherita (b) Quattro Stagioni (c) Seafood (d) Hawaiian")
    val pizza = readln().lowercase()
    if (pizza.length == 1 && pizza in "a".."d") {
        println("Order accepted")
    }
    else{
        println("Invalid choice!")
    }
    // Add your code here
}
