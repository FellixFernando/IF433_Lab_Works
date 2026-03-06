package oop_00000108757_FellixFernando.week05

class EWallet(balance: Double) : PaymentMethod(balance) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
            println("Sukses.")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo saat ini: $balance")
    }
}