package oop_00000108757_FellixFernando.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}