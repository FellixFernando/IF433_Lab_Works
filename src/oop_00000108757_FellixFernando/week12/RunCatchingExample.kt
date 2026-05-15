package oop_00000108757_FellixFernando.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching { "42X".toInt() }
}