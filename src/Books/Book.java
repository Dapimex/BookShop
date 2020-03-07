package Books;

import ShopEntities.BookShop;

public class Book {

    private String title;
    private String author;
    private double cost;
    private BookType type;

    public Book(String title, String author, double cost, BookType type, BookShop bs) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type = type;
        bs.addBook(this);
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

    @Override
    public String toString() {
        return String.format("%s | %s | %s", this.title, this.author, this.cost);
    }
}
