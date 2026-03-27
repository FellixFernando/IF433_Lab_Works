package oop_00000108757_FellixFernando.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status = ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Bob", 30)
    val data2 = DataUser("Bob", 30)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil copy: $data3")

    val (userName, userAge) = data1
    println("Destructured $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    when (val response: ApiResponse = ApiResponse.Success("Data berhasil diambil")) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan Alert: ${response.errorMessage}"
    }

}