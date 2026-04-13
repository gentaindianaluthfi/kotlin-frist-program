fun main(args: Array<String>) {
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)

    // Raw String
    var text = """
    for (c in "foo")
    print(c)
    """
    println(text)
}