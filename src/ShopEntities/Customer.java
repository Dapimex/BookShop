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
        for (Book book : booksBooked) {
            if (book.getTitle().equals(title))
                return book;
        }

        throw new IllegalArgumentException("Wrong book title " + title);
    }

    public ArrayList<Book> getBooks(BookType type) {
        ArrayList<Book> books = new ArrayList<>();

        for (Book book : booksBooked) {
            if (book.getType() == type)
                books.add(book);
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
