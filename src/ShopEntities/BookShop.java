package ShopEntities;

import Books.Book;
import Books.BookType;

import java.util.ArrayList;

public class BookShop {

    private ArrayList<Book> books;
    private ArrayList<Form> forms;
    private ArrayList<Customer> customers;
    private static BookShop instance;

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
    public ArrayList<Form> getForms() {
        return this.forms;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public ArrayList<Book> getBooks(BookType type) {
        ArrayList<Book> currentTypeBooks = new ArrayList<>();

        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getType() == type)
                currentTypeBooks.add(this.books.get(i));
        }

        return currentTypeBooks;
    }

    public ArrayList<Book> getBooks(String title) {
        ArrayList<Book> currentTitleBooks = new ArrayList<>();

        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title))
                currentTitleBooks.add(this.books.get(i));
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

    public void buyBooks(Form form) {
        Customer customer = form.getCustomer();
        customer.addBook(form.getBook());
        forms.add(form);
        deleteBook(form.getBook());
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void deleteBook(Book oldBook) {
        this.books.remove(oldBook);
    }

}
