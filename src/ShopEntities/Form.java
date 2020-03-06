package ShopEntities;

import Books.Book;

public class Form {

    private Book book;
    private Customer customer;

    public Form(Book book, Customer customer) {
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
