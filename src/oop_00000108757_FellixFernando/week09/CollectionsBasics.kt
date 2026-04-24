package oop_00000108757_FellixFernando.week09

fun main() {
    println("=== TEST LIST ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    //frameworks.add("Python")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutables List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers: $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active users: $activeUsers")

}