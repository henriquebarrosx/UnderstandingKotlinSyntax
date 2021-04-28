package objects

enum class Color(private val red: Int, private val blue: Int, private val green: Int) {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0); /* Required semicolon to separate the enums from methods */

    fun rgb() = ((red * 256 + green) * 256 + blue)
}