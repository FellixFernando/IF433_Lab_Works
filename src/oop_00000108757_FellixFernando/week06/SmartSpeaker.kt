package oop_00000108757_FellixFernando.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name menyala.")
    }

    override fun turnOff() {
        println("$name mati.")
    }

    fun playMusic(song: String) {
        println("\nMemutar lagu '$song' dari Spotify di $name\n")
    }
}