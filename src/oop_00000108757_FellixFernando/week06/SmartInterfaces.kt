package oop_00000108757_FellixFernando.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecording()
    fun stopRecording() {
        println("Perekaman dihentikan dan disimpan ke CLoud.")
    }
}