package oop_00000108757_FellixFernando.week04

open class Car(brand: String, val numberofDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan ${numberofDoors} pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! mobil $brand lewat")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}