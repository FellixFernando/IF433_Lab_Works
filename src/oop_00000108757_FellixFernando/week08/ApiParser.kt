package oop_00000108757_FellixFernando.week08

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val type = rawJson["type"] as? String ?: return null
    val id = rawJson["id"] as? String ?: println("API Invalid: Missing ID")
    val name = rawJson["name"] as? String ?: println("API Invalid: Missing Name")

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