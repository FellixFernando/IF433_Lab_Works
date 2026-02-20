package oop_00000108757_FellixFernando.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif")
                field = 0
            } else {
                field = value
            }
        }
}

