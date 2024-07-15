class Book(
    val title: String,
    val author: String,
    var pages: Int
)
{
    constructor(title: String, author: String): this(title, author, 0)
}
fun main(){
    val book1 = Book("Kifo kisimani", "Aj", 300)
    val book2 = Book("wassup", "what")

    println(book1)
    println("this book is ${book2.title} and name is ${book2.author} of pages ${book2.pages}")
}