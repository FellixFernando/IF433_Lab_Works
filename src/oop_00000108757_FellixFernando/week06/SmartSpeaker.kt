package oop_00000108757_FellixFernando.week06

class SmartSpeaker : SmartDevice, Switchable {
    override val id: String = "speaker-001"
    override val name: String = "Smart Speaker Ruang Keluarga"

    override fun turnOn() {
        println("$name menyala.")
    }

    override fun turnOff() {
        println("$name mati.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu '$song' dari Spotify di $name")
    }
}