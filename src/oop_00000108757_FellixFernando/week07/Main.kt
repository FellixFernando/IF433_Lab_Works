package oop_00000108757_FellixFernando.week07

fun main() {
    val gameManager = GameManager()
    gameManager.startGame()
    gameManager.startGame()

    println(ItemRarity.LEGENDARY.dropChance)

    val Weapon1 = Weapon.forgeStarterSword()
    println("Starter Weapon Durability = ${Weapon1.durability}")
    println("Starter Weapon Name = ${Weapon1.item.name}")
    println("Starter Weapon Damage = ${Weapon1.item.damage}")
    println("Starter Weapon Rarity = ${Weapon1.item.rarity}")

}