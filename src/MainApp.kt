fun main() {
    println("=== Program Kalkulator Sederhana ===")
    print("Masukkan angka pertama: ")
    val a = readLine()!!.toDouble()

    print("Masukkan angka kedua: ")
    val b = readLine()!!.toDouble()

    val tambah = a + b
    val kurang = a - b
    val kali = a * b
    val bagi = a / b

    println("\n--- Hasil Perhitungan ---")
    println("Hasil Tambah: $tambah")
    println("Hasil Kurang: $kurang")
    println("Hasil Kali   : $kali")
    println("Hasil Bagi   : $bagi")
}