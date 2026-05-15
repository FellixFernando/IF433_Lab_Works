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