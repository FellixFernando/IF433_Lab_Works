package oop_00000108757_FellixFernando.week04

fun main() {
    println("NIM : 00000108757")
    println("Nama : Fellix Fernando")
    println("--- Testing Vehicle ---\n")

    val generalVehicle = Vehicle("Generic Vehicle")
    generalVehicle.accelerate()
    generalVehicle.honk()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()