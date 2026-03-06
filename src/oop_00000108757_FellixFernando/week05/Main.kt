package oop_00000108757_FellixFernando.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("--- AKTIVITAS PEGAWAI ---")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})\n")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("--- TUGAS 1 ---")

    println(hitungLuas(5))
    println(hitungLuas(2, 3))
    println(hitungLuas(7.0))

    println("--- TUGAS 2 ---")
    val gopay = EWallet(50000.0)
    val visaCard = CreditCard(100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(gopay, visaCard)

    for (pembayaran in daftarPembayaran) {
        pembayaran.processPayment(75000.0)
    }
}