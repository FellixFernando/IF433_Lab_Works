package oop_00000108757_FellixFernando.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTC/USDT", "Long", 10, 15.5, "CLOSED"),
        TradeLog("ETH/USDT", "Short", 5, -8.2, "OPEN"),
        TradeLog("XRP/USDT", "Long", 20, 25.0, "CLOSED"),
        TradeLog("ADA/USDT", "Short", 15, -12.3, "CLOSED"),
        TradeLog("ETH/USDT", "Long", 30, -7.6, "OPEN"),
        TradeLog("BTC/USDT", "Short", 25, 10.0, "OPEN"),
        TradeLog("XRP/USDT", "Long", 5, 5.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}