package oop_00000108757_FellixFernando.week12

class InsufficientFundException(val amount: Double, val balance: Double) :
    Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundException(amount, balance)
        }
        balance -= amount
        println("Withdrawal succesful. Remaining balance: $balance")
    }
}

fun main() {
    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try {
        account.withdraw(50.0)
    } catch (e: InsufficientFundException) {
        println("Caught Domain Error: Uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error : Input tidak valid ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error : Terjadi kesalahan tidak terduga")
    }
}
