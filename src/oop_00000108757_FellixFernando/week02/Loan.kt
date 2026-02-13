package oop_00000108757_FellixFernando.week02

import java.util.*

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1
) {
    init {
        if (loanDuration < 0) {
            println("WARNING: Durasi peminjaman buku tidak boleh negatif, mengatur ke 1 hari.")
            loanDuration = 1
        }
    }
}

fun main() {

    val scanner = Scanner(System.`in`)
    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Durasi Peminjaman (dalam hari): ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    var denda = 0
    if (loanDuration < 0) {
        println("WARNING: Durasi peminjaman buku tidak boleh negatif, mengatur ke 1 hari.")
        loanDuration = 1
    }
    if (loanDuration > 3) {
        denda = calculateFine(loanDuration)
    }
    val loan = Loan(bookTitle, borrower, loanDuration)
    println("--- Detail Peminjaman Buku ---")

    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Peminjaman: ${loan.loanDuration} hari")
    println("Denda: Rp$denda")

}

fun calculateFine(loanDuration: Int) = (loanDuration - 3) * 2000
