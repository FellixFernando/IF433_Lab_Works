package oop_00000108757_FellixFernando.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name menyala.")
    }

    override fun turnOff() {
        println("$name mati.")
    }
}
