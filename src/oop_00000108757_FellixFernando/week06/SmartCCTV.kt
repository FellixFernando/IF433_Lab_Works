package oop_00000108757_FellixFernando.week06

class SmartCCTV : SmartDevice, Switchable, Recordable {
    override val id: String = "cctv-001"
    override val name: String = "CCTV Pintu Utama"

    override fun startRecording() {
        println("$name mulai merekam.")
    }

    override fun turnOn() {
        println("$name menyala.")
        startRecording()
    }

    override fun turnOff() {
        println("$name mati.")
    }
}