package Books;

import BookFormatStrategies.BookFormatStrategy;
import ShopEntities.BookShop;

public class Book {

    private String title;
    private String author;
    private double cost;
    private BookType type;
    private BookFormatStrategy strategy;

    public Book(String title, String author, double cost, BookType type, BookShop bs, BookFormatStrategy strategy) {
        this.title = title;
        this.author = author;
        this.cost = cost;
        this.type = type;
        this.strategy = strategy;
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

    public BookFormatStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(BookFormatStrategy strategy) {
        this.strategy = strategy;
    }

    public void nextPage() {
        strategy.nextPage();
    }

    public void close() {
        strategy.closeBook();
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s", this.title, this.author, this.cost);
    }
}
