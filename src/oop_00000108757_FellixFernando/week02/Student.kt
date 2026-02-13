package oop_00000108757_FellixFernando.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah dalam sistem.")
        } else {
            println("LOG: OBjek Student $name berhasil dialokasikan di memory.")
        }
    }
}
