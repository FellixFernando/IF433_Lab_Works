package oop_00000108757_FellixFernando.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status = ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}