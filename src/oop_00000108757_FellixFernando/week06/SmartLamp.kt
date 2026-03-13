package oop_00000108757_FellixFernando.week06

class SmartLamp : SmartDevice, Switchable {
    override val id: String = "lampu-001"
    override val name: String = "Lampu Ruang Tamu"
    override fun turnOn() {
        println("Lampu Ruang Tamu menyala.")
    }

    override fun turnOff() {
        println("Lampu Ruang Tamu mati.")
    }
}
