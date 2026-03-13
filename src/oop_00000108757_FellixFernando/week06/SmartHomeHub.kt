package oop_00000108757_FellixFernando.week06

class SmartHomeHub(val devices: MutableList<SmartDevice> = mutableListOf()) {
    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan ke Smart Home Hub.")
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
        println("Mengaktifkan mode keamanan...")
        for (device in devices) {
            when (device) {
                is Recordable -> device.startRecording()
                is SmartSpeaker -> device.playMusic("Sirine Peringatan")
            }
        }
    }

    fun listDevices() {
        println("Daftar Perangkat di Smart Home Hub:")
        devices.forEach { device ->
            println("- ${device.name} (ID: ${device.id})")
        }
    }


}
