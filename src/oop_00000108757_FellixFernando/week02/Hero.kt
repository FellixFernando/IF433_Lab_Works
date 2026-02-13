package oop_00000108757_FellixFernando.week02

import java.util.*

class Hero(
    val name: String,
    var hp: Int,
    var baseDamage: Int

) {
    fun attack(targetName: String) {
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0
    }

    fun isAlive() = hp > 0

    constructor(name: String, baseDamage: Int) : this(name, hp = 100, baseDamage) {
        println("LOG: Menggunakan constructor dengan HP default.")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    scanner.nextLine()

    val hero = Hero(name, baseDamage)
    println("Hero ${hero.name} berhasil dibuat dengan HP ${hero.hp} dan Base Damage ${hero.baseDamage}.")

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- Giliran Hero ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val action = scanner.nextInt()

        when (action) {
            1 -> {
                hero.attack("Musuh")
                enemyHp -= hero.baseDamage
                println("Musuh menerima ${hero.baseDamage} damage, sisa HP musuh: $enemyHp")

                if (enemyHp > 0) {
                    println("\n--- Giliran Musuh ---")
                    val enemyDamage = (10..20).random()
                    println("Musuh menyerang ${hero.name}!")
                    hero.takeDamage(enemyDamage)
                    if (!hero.isAlive()) {
                        println("${hero.name} telah dikalahkan!")
                        break
                    } else {
                        println("${hero.name} menerima $enemyDamage damage, sisa HP: ${hero.hp}")
                    }
                }
            }

            2 -> {
                println("${hero.name} memilih untuk kabur! Pertarungan berakhir.")
                break
            }

            else -> println("Aksi tidak valid, giliran terlewat.")
        }

    }
    println("\n--- HASIL PERTARUNGAN ---")
    if (hero.isAlive() && enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("${hero.name} telah dikalahkan oleh musuh.")
    } else {
        println("Pertarungan berakhir karena ${hero.name} kabur.")
    }
}