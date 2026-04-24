package oop_00000108757_FellixFernando.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "Long", 10, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "Short", 5, -8.2, "OPEN"),
        TradeLog("XRPUSDT", "Long", 20, 25.0, "CLOSED"),
        TradeLog("ADAUSDT", "Short", 15, 12.3, "CLOSED"),
        TradeLog("ETHUSDT", "Long", 30, 7.6, "OPEN"),
        TradeLog("BTCUSDT", "Short", 25, 10.0, "OPEN"),
        TradeLog("XRPUSDT", "Long", 5, -5.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0.0 }
    val losingTrades = closedTrades.filter { it.roe <= 0.0 }

    val topPerformerString = winningTrades.sortedByDescending { it.roe }
        .map { println("WIN [${it.pair} - ${it.position}]: +${it.roe}% (Leverage: ${it.leverage}x)") }

}