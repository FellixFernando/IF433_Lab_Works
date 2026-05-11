package oop_00000108757_FellixFernando.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    val lampu1 = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
    val kamera1 = SmartDevice("Ezviz Outdoor", "").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung: ${it.name}")
        homeDevices.add(it)
    }
}