package oop_00000108757_FellixFernando.week04

fun main() {
    println("NIM : 00000108757")
    println("Nama : Fellix Fernando")
    println("Vehicle\n")

    val myVehicle = Vehicle("Generic Vehicle")
    myVehicle.accelerate()
    myVehicle.honk()

    println("\nCar")
    val myCar = Car("Toyota", 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()
}