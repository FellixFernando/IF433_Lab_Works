package oop_00000108757_FellixFernando.week09

fun main() {
    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b }
    println("Sum Lambda: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Square Implicit: ${squareImplicit(4)}")
}