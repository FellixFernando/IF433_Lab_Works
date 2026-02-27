package oop_00000108757_FellixFernando.week04

fun main() {
    println("NIM : 00000108757")
    println("Nama : Fellix Fernando")
    println("--- Task 1 ---")
    println("--- Testing Vehicle ---\n")

    val generalVehicle = Vehicle("Generic Vehicle")
    generalVehicle.accelerate()
    generalVehicle.honk()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.accelerate()
    myCar.honk()
    myCar.openTrunk()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar("Tesla", 4, 80)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Task 2 ---")
    println("--- Testing Manager ---\n")
    val manager = Manager("Alice", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer("Bob", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}