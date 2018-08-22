enum class Directions {
    NORTH, SOUTH, WEST, EAST, START, END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)

    val north = {path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}

    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val game = Game()
    /*
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
    */
    while (true) {
    print("Enter a dir: n/s/e/w")
    game.makeMove(readLine())
    }
}