package oop_00000108757_FellixFernando.week08

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val type = rawJson["type"] as? String ?: return null
    val id = rawJson["id"] as? String ?: run {
        println("API Invalid: Missing ID")
        return null
    }
    val name = rawJson["name"] as? String ?: run {
        println("API Invalid: Missing Name")
        return null
    }

    return when (type) {
        "electronic" -> {
            val warrantyMonths = rawJson["warrantyMonths"] as? Int ?: 12
            Electronic(id, name, warrantyMonths)
        }

        "clothing" -> {
            val size = rawJson["size"] as? String ?: "All Size"
            Clothing(id, name, size)
        }

        else -> null
    }
}

fun checkout(product: Product) {
    val id = when (product) {
        is Electronic -> product.id
        is Clothing -> product.id
    }

    val transactionId = JavaPaymentService.processPayment(id)!!
    println("Transaction ID: $transactionId")
}