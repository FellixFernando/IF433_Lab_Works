package oop_00000108757_FellixFernando.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println(("${nama} sedang menyiapkan materi perkuliiahan dan merevisi RPKPKS"))
    }

    fun mengajar() {
        println("${nama} sedang mengajar di kelas.")
    }
}