fun main() {
    println(returnName("Henrique", "Barros"));
}

fun returnName(name: String, lastName:String ) {
    /*
    *   var - Mutable variable
    *   val - Immutable variable
    */
    val fullName: String = "$name $lastName"
    println("Welcome, $fullName");
}

