package oop_00000108757_FellixFernando.week05

abstract class PaymentMethod(var balance: Double) {
    abstract fun processPayment(amount: Double)
}