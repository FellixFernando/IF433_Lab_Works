package oop_00000108757_FellixFernando.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar Oled menyala: 14:00 WIB")
    }

    override fun connectToBlueTooth() {
        println("Mencari perangkat HP di sekitar untuk pairing....")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger 15W")
    }
}