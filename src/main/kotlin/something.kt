import objects.Square

fun main() {
    println(fruitMessage())
    println(isSquare())
}

fun fruitMessage() {
    val fruit = Fruit("Strawberry", "Red", 0.5)
    println("The ${fruit.color} ${fruit.name} costs $${fruit.costs} dollars")
}

fun isSquare() {
    val square = Square(10, 10)
    println("Is square: ${square.isSquare}")
}