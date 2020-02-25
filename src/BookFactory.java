import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    List<Book> books = new ArrayList<>();
    protected int ranobeBookCounter;
    protected int fantasyBookCounter;
    protected int detectiveBookCounter;
    protected int thrillerBookCounter;

    public Book getBook(String title, String author, double cost, BookType type) {
        Book newBook = null;
        switch (type) {
            case RANOBE:
                ranobeBookCounter++;
                newBook = new Ranobe(title, author, cost, type);
                break;
            case FANTASY:
                fantasyBookCounter++;
                newBook = new Fantasy(title, author, cost, type);
                break;
            case THRILLER:
                thrillerBookCounter++;
                newBook = new Thriller(title, author, cost, type);
                break;
            case DETECTIVE:
                detectiveBookCounter++;
                newBook = new Detective(title, author, cost, type);
                break;
            default:
                throw new IllegalArgumentException("Wrong book type " + type);
        }
        books.add(newBook);
        return newBook;
    }

}
