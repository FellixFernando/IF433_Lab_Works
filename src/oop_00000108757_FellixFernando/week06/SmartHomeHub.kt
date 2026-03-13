package oop_00000108757_FellixFernando.week06

class SmartHomeHub(val devices: MutableList<SmartDevice> = mutableListOf()) {
    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("\nPerangkat '${device.name}' berhasil ditambahkan ke Smart Home Hub.")
    }

    fun turnOnAllSwitches() {
        println("Menyalakan semua perangkat yang dapat di-switch...")
        for (device in devices) {
            when (device) {
                is Switchable -> device.turnOn()
            }
        }
    }

    fun turnOffAllSwitches() {
        println("Mematikan semua perangkat yang dapat di-switch...")
        for (device in devices) {
            when (device) {
                is Switchable -> device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\nMengaktifkan mode keamanan...")
        for (device in devices) {
            when (device) {
                is Recordable -> device.startRecording()
                is SmartSpeaker -> device.playMusic("Sirine Peringatan")
            }
        }
    }

    fun listDevices() {
        println("\nDaftar Perangkat di Smart Home Hub:")
        devices.forEach { device ->
            println("- ${device.name} (ID: ${device.id})")
        }
        println()
    }
}

fun main() {
    val hub = SmartHomeHub()
    val lamp = SmartLamp("lampu-001", "Lampu Ruang Tamu")
    val cctv = SmartCCTV("cctv-001", "Ezviz Garasi")
    val speaker = SmartSpeaker("speaker-001", "Google Nest Dapur")

    hub.addDevice(lamp)
    hub.addDevice(cctv)
    hub.addDevice(speaker)

    hub.listDevices()
    hub.turnOnAllSwitches()
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}
