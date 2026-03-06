package oop_00000108757_FellixFernando.week05

class CreditCard(val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod() {
    override fun processPayment(amount: Double) {
        if ((usedAmount + amount <= limit)) {
            usedAmount += amount
            println("Sukses.")
        } else {
            println("Limit tidak cukup, transaksi gagal.")
        }
    }
}