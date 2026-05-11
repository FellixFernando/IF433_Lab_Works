package oop_00000108757_FellixFernando.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Length: $length")
}