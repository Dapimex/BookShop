public abstract class Book {

    private String title;
    private String author;
    private double cost;
    private BookType type;
    private boolean available = true;

    public Book(String title, String author, double cost, BookType type) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getCost() {
        return cost;
    }

    public BookType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }

    @Override
    public String toString() {
        return String.format("%s | %s", this.title, this.author);
    }
}
