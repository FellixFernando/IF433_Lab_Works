package oop_00000108757_FellixFernando.week03

fun main() {
    val e = Employee("Fellix")
    e.salary = -1000
    e.salary = 5000
    println("Gajii: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}

