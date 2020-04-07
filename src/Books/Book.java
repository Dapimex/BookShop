package Books;

import BookFormats.BookFormat;
import ShopEntities.BookShop;

public class Book {

    private String title;
    private String author;
    private double cost;
    private BookType type;
    private BookFormat format;

    public Book(String title, String author, double cost, BookType type, BookShop bs, BookFormat format) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type = type;
        this.format = format;
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

    public BookFormat getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s", this.title, this.author, this.cost);
    }
}
