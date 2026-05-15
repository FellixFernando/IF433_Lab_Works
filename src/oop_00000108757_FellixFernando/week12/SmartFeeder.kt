package oop_00000108757_FellixFernando.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    println("Kibble berhasil dikeluarkan")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("ERROR DISPENSER: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR MAKANAN: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("=== JADWAL MAKAN SORE ===")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble : $currentKibbleStock gr")
    }.onFailure { error ->
        println(
            "Peringatan ke pemilik : ${error.message}" +
                    "\nOpsional : Berikan chicken jerky secara manual"
        )
    }
    //yes
}