package oop_00000108757_FellixFernando.week03

class Weapon(
    val name: String
) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage $name tidak boleh negatif. Nilai damage gagal diubah.")
            } else if (value > 1000) {
                println("ERROR: Damage $name tidak boleh lebih dari 1000. Nilai damage diubah menjadi 1000.")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() {
            return when (damage) {
                in 0..500 -> "Common"
                in 501..800 -> "Epic"
                in 801..1000 -> "Legendary"
                else -> "Unknown"
            }
        }
}