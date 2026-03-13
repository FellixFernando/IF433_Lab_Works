package oop_00000108757_FellixFernando.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun startRecording() {
        println("$name mulai merekam.")
    }

    override fun turnOn() {
        println("$name menyala.")
        startRecording()
    }

    override fun turnOff() {
        super.stopRecording()
        println("$name mati.")
    }
}