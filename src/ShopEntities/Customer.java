package ShopEntities;

import Books.Book;
import Books.BookType;

import java.util.ArrayList;

public class Customer {
    String name;
    String phone;
    ArrayList<Book> booksBooked;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.booksBooked = new ArrayList<>();
    }

    public Book getBook(String title) {
        for (int i = 0; i < booksBooked.size(); i++) {
            if (booksBooked.get(i).getTitle().equals(title))
                return booksBooked.get(i);
        }

        throw new IllegalArgumentException("Wrong book title " + title);
    }

    public ArrayList<Book> getBooks(BookType type) {
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < booksBooked.size(); i++) {
            if (booksBooked.get(i).getType() == type)
                books.add(booksBooked.get(i));
        }

        return books;
    }

    public ArrayList<Book> getAllBooks() {
        return this.booksBooked;
    }

    public void addBook(Book book) {
        this.booksBooked.add(book);
    }
}
