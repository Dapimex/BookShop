import java.util.ArrayList;

public class BookShop {

    private ArrayList<Book> books;
    private ArrayList<Form> forms;
    private ArrayList<Customer> customers;

    public BookShop() {
        this.books = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.forms = new ArrayList<>();
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

    public int getBooksAmount() {
        return books.size();
    }

    public int getBooksAmount(BookType type) {
        ArrayList<Book> currentTypeBooks = getBooks(type);
        return currentTypeBooks.size();
    }

    public void bookBooks(Form form) {
        Customer customer = form.getCustomer();
        customer.addBook(form.getBook());
        forms.add(form);
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

}
