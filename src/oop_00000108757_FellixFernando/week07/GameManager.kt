package oop_00000108757_FellixFernando.week07

class GameManager(var isGameRunning: Boolean = false) {
    fun startGame() {
        when (isGameRunning) {
            true -> println("Game sudah berjalan!")
            false -> println("Memulai game engine...")
        }
    }
}