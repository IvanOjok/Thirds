class Book {
    var t:String = ""
    constructor(type:String, title:String) {
        this.t = title
    }
    fun createBook() {
        println("Title is $t")
    }
}

fun main() {
    val book1 = Book("Biology", "Species")
    book1.createBook()
}