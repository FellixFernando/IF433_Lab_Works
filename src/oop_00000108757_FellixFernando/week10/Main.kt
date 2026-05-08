package oop_00000108757_FellixFernando.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val strBox = Box("Generics in Kotlin")

    println("Isi intBox : ${intBox.value}")
    println("Isi strBox : ${strBox.value}")

    println("=== TEST MULTIPLE PARAMETERS")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Result: $result")
}