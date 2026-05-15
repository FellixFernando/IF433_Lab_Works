package oop_00000108757_FellixFernando.week12

class InsufficientFundException(val amount: Double, val balance: Double) :
    Exception("Attempted $amount, balance: $balance")