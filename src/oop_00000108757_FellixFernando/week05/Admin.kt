package oop_00000108757_FellixFernando.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("${nama} sedang duduk di depa komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("${nama} sedang merekap data absensi mahasiswa.")
    }
}