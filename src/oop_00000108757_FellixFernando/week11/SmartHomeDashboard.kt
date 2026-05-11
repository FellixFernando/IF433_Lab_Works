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
    val kamera1 = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung: ${it.name}")
        homeDevices.add(it)
    }

    val pendingin1 = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }.also {
        homeDevices.add(it)
    }

    val petFeeder1 = SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10).also {
        homeDevices.add(it)
    }

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }?.let {
        println(it.diagnose())
    }

    with(homeDevices) { println("Jumlah perangkat terhubung: " + this.size) }

}