package oop_00000108757_FellixFernando.week03

class Employee(
    val name: String,
    private var performanceRating: Int = 3,
) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif")
                field = 0
            } else {
                field = value
            }
        }

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating : $performanceRating")
    }

}

