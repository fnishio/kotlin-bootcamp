import java.util.Random

const val MAX_BORROW = 5

open class Book(val title: String, val author: String, val year: Int,
    var pages: Int) {
    private var currentPage: Int = 1
    private var borrowing: Int = 0

    companion object {
        val BASE_URL = "http://book.com"
    }

    open fun readPage() {
        currentPage++
    }
    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }
    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
    fun canBorrow(): Boolean {
        return (borrowing < MAX_BORROW)
    }
    fun printUrl() {
        println("$BASE_URL/$title.html")
    }
}

class eBook(title: String, author: String, year: Int, pages: Int, val format: String = "text")
    : Book (title, author, year, pages) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}
fun Book.weight(): Double = pages * 1.5
fun Book.tornPages(tornedPages: Int) {
    if (pages >= tornedPages) {
        pages -= tornedPages
    } else {
        pages = 0
    }
}

fun main(args: Array<String>) {
    val book = Book("Die Verwandlung", "Franz Kafka", 1915, 500)
    val (title, author, year) = book.getTitleAuthorYear()
    println("Here is your book $title written by $author in $year")
    book.printUrl()

    val allBooks = setOf("Hamlet", "Othello", "Macbeth")
    val library = mapOf("Shakespeare" to allBooks)
    println(library)
    println("Hamlet? " + library.any{it.value.contains("Hamlet")})
    val moreBooks = mutableMapOf("Die Verwandlung" to "Kafka")
    moreBooks.getOrPut("Hamlet") { "Shakespeare"}
    println(moreBooks)

    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages}")
    }
}