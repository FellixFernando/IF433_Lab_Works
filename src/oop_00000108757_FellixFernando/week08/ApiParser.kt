package oop_00000108757_FellixFernando.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val type = rawJson["type"] as? String
            ?: throw IllegalArgumentException("Missing type")

        val id = rawJson["id"] as? String
            ?: throw IllegalArgumentException("Missing ID")

        val name = rawJson["name"] as? String
            ?: throw IllegalArgumentException("Missing Name")

        return when (type) {
            "ELECTRONIC" -> {
                val warrantyMonths = rawJson["warranty"] as? Int ?: 12
                return Electronic(id, name, warrantyMonths)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                return Clothing(id, name, size)
            }

            else -> {
                println("API Invalid: Unknown product type '$type'")
                null
            }
        }
    }
}

fun checkout(product: Product) {
    val id = when (product) {
        is Electronic -> product.id
        is Clothing -> product.id
    }

    val transactionId = JavaPaymentService.processPayment(id)!!
    println("Transaction id: $transactionId")

}