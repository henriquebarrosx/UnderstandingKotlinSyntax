import objects.Color

fun main() {
    println("Short Function: ${sum1(3, 5)}");
    println("Block Function: ${ sum2(3, 5) }");

    println("Color: ${getColorStr(Color.BLUE)}");
    println("Color: ${getColorTemperatureStr(Color.BLUE)}");
}

// Expression body with inline conditional
fun sum1(x: Int, y: Int): Int = if (x > 3) x + y else x * y;

// Block body
fun sum2(x: Int, y: Int): Int {
    return if (x > 3) x + y else x * y;
}

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

// Conditionals using enum multi match
fun getColorTemperatureStr(color: Color): String {
    return when(color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Hot"
        Color.BLUE -> "Neutral"
        Color.GREEN -> "Cool"
    }
}