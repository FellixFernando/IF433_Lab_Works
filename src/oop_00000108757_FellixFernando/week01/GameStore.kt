package oop_00000108757_FellixFernando.week01

fun main(){
    val gameTitle = "Elden Ring"
    val price = 730000
    val userNote: String?= null

    printReceipt(gameTitle, price, calculateDiscount(price), userNote)
}
fun calculateDiscount(price: Int) = if(price>500000) (price*0.8).toInt() else (price*0.9).toInt()

fun printReceipt(title: String, price: Int, finalPrice: Int, note: String?){
    println("STRUK BELANJA")
    val noteText = note ?: "Tidak ada Catatan"
    println("Judul Game: $title")
    println("Harga : $price")
    println("Harga Akhir : $finalPrice")
    println("Catatan : $noteText")
}

