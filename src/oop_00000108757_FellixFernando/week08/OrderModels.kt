package oop_00000108757_FellixFernando.week08

class OrderModels {

    class City(val name: String)
    class Address(val city: City?)
    class DeliveryDetail(val address: Address?)
    class Order(val deliveryDetails: DeliveryDetail?, val totalPrice: Int?)
}