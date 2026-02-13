package oop_00000108757_FellixFernando.week02

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter) : ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")

    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        Student(name, nim, major)
        println("Status: Pendaftaran Selesai")
    }
}