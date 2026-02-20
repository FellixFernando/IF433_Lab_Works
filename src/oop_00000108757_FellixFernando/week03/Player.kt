package oop_00000108757_FellixFernando.week03

class Player(
    val name: String,
    private var xp: Int = 0

) {
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("ERROR: XP tidak boleh negatif. Nilai XP gagal diubah.")
        }

        val oldlevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldlevel) {
            println("Level UP! $name naik ${newLevel - oldlevel} ke level $newLevel")
        }

    }
}