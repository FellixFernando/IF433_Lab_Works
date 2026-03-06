package oop_00000108757_FellixFernando.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}