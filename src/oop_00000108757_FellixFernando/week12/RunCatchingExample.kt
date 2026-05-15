package oop_00000108757_FellixFernando.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching { "42X".toInt() }

    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal dikonversi: $e")
    }
}