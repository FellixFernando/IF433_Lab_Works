package oop_00000108757_FellixFernando.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("Bitcoin", 1.5))
    coinRepo.add(Coin("Ethereum", 10.0))
    coinRepo.add(Coin("USDT", 15.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Response status: ${response.status}")

    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }
}