import java.lang.IllegalArgumentException

interface Expression

class Number(val value: Int): Expression
class Sum(val leftValue: Expression, val rightValue: Expression): Expression

fun validation(expression: Expression): Int {
  // To smart cast work should check if variable is a instance of something
  if(expression is Number) {
    return expression.value
  }

  if(expression is Sum) {
    return validation(expression.leftValue) + validation(expression.rightValue)
  }

  throw IllegalArgumentException("Unknown expression")
}

fun validationUsingBranchBlock(expression: Expression): Int {
  return when(expression) {
    // Branch block
    is Sum -> {
      val validate = fun (expression: Expression) = validationUsingBranchBlock(expression)
      validate(expression.leftValue) + validate(expression.rightValue)
    }
    is Number -> expression.value
    else -> throw IllegalArgumentException("Unknown expression")
  }
}

fun main() {
  // ((2 + 2) + 5)
  val value1: Int = validation(
    Sum(
      Sum(
        Number(2),
        Number(2)
      ),
      Number(5)
    )
  )

  val value2: Int = validationUsingBranchBlock(
    Sum(
      Sum(
        Number(2),
        Number(2)
      ),
      Number(5)
    )
  )

  println("Value: $value1")
  println("Value: $value2")
}