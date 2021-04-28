fun main() {
    println("Normal Function: ${ sum1(3, 5) }");

    println("Short Function: ${sum2(3, 5)}");

    println(returnName("Henrique", "Barros"));

    println(fruitMessage());
}

// Block body
fun sum1(x: Int, y: Int): Int {
    // Inline conditional
    return if (x > 3) x + y else x * y;
}

// Expression body
fun sum2(x: Int, y: Int): Int = if (x > 3) x + y else x * y;

// Creating variables
fun returnName(name: String, lastName:String ) {
    /*
    *   var - Mutable variable
    *   val - Immutable variable
    */
    val fullName: String = "$name $lastName"
    println("Welcome, $fullName");
}

class Fruit (val name: String, val color: String, val costs: Double)

// Working with Classes
fun fruitMessage() {
    val fruit: Fruit = Fruit("Strawberry", "Red", 0.5)
    println("The ${fruit.color} ${fruit.name} costs $${fruit.costs} dollars");
}