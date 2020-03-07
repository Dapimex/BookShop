package ShopEntities;

import Books.Book;
import Books.BookType;

import java.util.ArrayList;

public class BookShop {

    private static BookShop instance;
    private ArrayList<Book> books;
    private ArrayList<Form> forms;
    private ArrayList<Customer> customers;

    private BookShop() {
        this.books = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.forms = new ArrayList<>();
    }

    public static BookShop getInstance() {
        if (instance == null) {
            instance = new BookShop();
        }
        return instance;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public ArrayList<Book> getBooks(BookType type) {
        ArrayList<Book> currentTypeBooks = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getType() == type)
                currentTypeBooks.add(book);
        }

        return currentTypeBooks;
    }

    public ArrayList<Book> getBooks(String title) {
        ArrayList<Book> currentTitleBooks = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getTitle().equals(title))
                currentTitleBooks.add(book);
        }

        return currentTitleBooks;
    }

    public int getBooksAmount() {
        return books.size();
    }

    public int getBooksAmount(BookType type) {
        ArrayList<Book> currentTypeBooks = getBooks(type);
        return currentTypeBooks.size();
    }

    public ArrayList<Form> getForms() {
        return this.forms;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void deleteBook(Book oldBook) {
        this.books.remove(oldBook);
    }

    public void buyBook(Form form) {
        Customer customer = form.getCustomer();
        customer.addBook(form.getBook());
        forms.add(form);
        deleteBook(form.getBook());
    }
}
