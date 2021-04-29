import objects.Color

fun main() {
    println("Normal Function: ${ sum1(3, 5) }");
    println("Short Function: ${sum2(3, 5)}");
    println("Color: ${getColorStr(Color.BLUE)}");
}

// Block body
fun sum1(x: Int, y: Int): Int {
    // Inline conditional
    return if (x > 3) x + y else x * y;
}

// Expression body
fun sum2(x: Int, y: Int): Int = if (x > 3) x + y else x * y;

// Conditionals using enum
fun getColorStr(color: Color): String {
    return when(color) {
        Color.RED -> "Red"
        Color.BLUE -> "Blue"
        Color.GREEN -> "Green"
        Color.ORANGE -> "Orange"
        Color.YELLOW -> "Yellow"
    }
}