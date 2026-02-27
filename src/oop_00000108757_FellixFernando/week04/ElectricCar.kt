package oop_00000108757_FellixFernando.week04

open class ElectricCar(brand: String, numberofDoors: Int, val batteryCapacity: Int) : Car(brand, numberofDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dengan sunyi. Kapasitas baterai: $batteryCapacity.")
    }
}