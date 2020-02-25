public class Form {

    private Book book;
    private Customer customer;
    private int days;

    public Form(Book book, Customer customer, int days) {
        if (!book.isAvailable()) {
            System.out.println("Book is not available");
            return;
        }
        this.book = book;
        this.customer = customer;
        this.days = days;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return String.format("%s booked '%s'", customer.name, book.getTitle());
    }
}
