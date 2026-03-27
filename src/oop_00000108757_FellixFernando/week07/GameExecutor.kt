package oop_00000108757_FellixFernando.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Monster ${event.monsterName} muncul!")
        is BattleState.LootDropped -> println("Item ${event.item.name} ditemukan dengan damage ${event.item.damage} dan rarity ${event.item.rarity}")
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di zona aman.")
    }
}