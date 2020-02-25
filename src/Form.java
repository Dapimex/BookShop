public class Form {

    private Book book;
    private Customer customer;

    public Form(Book book, Customer customer, int days) {
        this.book = book;
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return String.format("%s booked '%s'", customer.name, book.getTitle());
    }
}
