package oop_00000108757_FellixFernando.week04

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat.")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}