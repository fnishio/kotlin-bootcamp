fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.div {
        it.rem(3)
    })
}

fun List<Int>.div(block: (Int) -> Int) : List<Int>{
    val result = mutableListOf<Int>()
    for(i in this) {
        if (block(i) == 0) {
            result.add(i)
        }
    }
    return result
}