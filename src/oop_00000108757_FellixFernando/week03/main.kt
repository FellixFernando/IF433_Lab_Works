package oop_00000108757_FellixFernando.week03

fun main() {
    val e = Employee("Fellix")
    println("--- Test Error ---")
    e.salary = 5000
    println(e.salary)
    println("--- Test Performance ---")
    e.printStatus()
    e.increasePerformance()
    e.printStatus()
}

