public abstract class Book {

    String title;
    String author;
    double cost;
    BookType type;

    public Book(String title, String author, double cost, BookType type) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type = type;
    }

}
