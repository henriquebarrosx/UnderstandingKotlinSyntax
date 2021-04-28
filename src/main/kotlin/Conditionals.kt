fun main() {
    println("Normal Function: ${ sum1(3, 5) }");
    println("Short Function: ${sum2(3, 5)}");
}

// Block body
fun sum1(x: Int, y: Int): Int {
    // Inline conditional
    return if (x > 3) x + y else x * y;
}

// Expression body
fun sum2(x: Int, y: Int): Int = if (x > 3) x + y else x * y;