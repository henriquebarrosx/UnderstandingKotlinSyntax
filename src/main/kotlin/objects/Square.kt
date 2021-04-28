package objects

class Square(private val height: Int, private val width: Int) {

    /* Customized Advisors */
    val isSquare: Boolean
        get() {
            return height == width;
        }

    /*
    *  OR
    *
    *  val isSquare: Boolean
    *    get() = height == width;
    *
    *  OR
    *
    *  fun isSquare():Boolean {
    *     return height == width
    *  }
    */
}