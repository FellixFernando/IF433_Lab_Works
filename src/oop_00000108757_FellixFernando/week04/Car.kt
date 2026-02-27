package oop_00000108757_FellixFernando.week04

open class Car(brand: String, val numberofDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan ${numberofDoors} pintu dibuka.")
    }
}