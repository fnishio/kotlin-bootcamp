class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() = 5
}

fun main(args: Array<String>) {
    val aSpice = SimpleSpice()
    println("Name: ${aSpice.name}, Heat: ${aSpice.heat}")
}