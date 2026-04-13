fun main(args: Array<String>) {
    // Konversi
    val valInt: Int = 1
    val valSum: Long = 3L + valInt // implisit
    val valLong: Long = valInt.toLong() // eksplisit

    // Character functions
    var charA : Char = 'A'
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.lowercaseChar())
}