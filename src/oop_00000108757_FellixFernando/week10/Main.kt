package oop_00000108757_FellixFernando.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val strBox = Box("Generics in Kotlin")

    println("Isi intBox : ${intBox.value}")
    println("Isi strBox : ${strBox.value}")
}