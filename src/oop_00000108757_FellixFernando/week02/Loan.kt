package oop_00000108757_FellixFernando.week02

import java.util.*

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    init {
        if (loanDuration > 3) {
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    scanner.nextLine()

    print("Masukkan Durasi Peminjaman (dalam hari): ")
    scanner.nextInt()

    scanner.nextLine()

}