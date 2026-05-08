package oop_00000108757_FellixFernando.week10

interface HasName {
    val name: String
}

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun getByName(name: String): T? {
        return items.firstOrNull { item ->
            (item as? HasName)?.name == name
        }
    }
}
