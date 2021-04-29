fun main() {
  // Creating a list
  val fruits = listOf("Apple", "Strawberry", "Orange", "Grape")

  val iterateByArray = fruits.map { "I love $it" }

  val filterApple = fruits.filter { it == "Apple" }

  val findApple = fruits.find { it == "Apple" }

  val reduceFruits = fruits.reduce {
      accumulate, attribute -> "$accumulate, $attribute"
  }

  println("Iterating into array: $iterateByArray")
  println("Filter fruit: $filterApple")
  println("Find fruit: $findApple")
  println("Reduce fruits: $reduceFruits")
}