package oop_00000108757_FellixFernando.week03

fun main() {
    val Weapon1 = Weapon("Excalibur")
    Weapon1.damage = -50
    Weapon1.damage = 9999
    println("Tier ${Weapon1.name} : ${Weapon1.tier}")

    println()

    val Player1 = Player("Fellix")
    //error println("${Player1.xp}")
    Player1.addXp(50)
    println("Level ${Player1.name} = ${Player1.level}")
    Player1.addXp(60)
    Player1.addXp(180)
}

