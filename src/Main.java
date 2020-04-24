import BookFormatStrategies.*;
import Books.Book;
import Books.BookType;
import ShopEntities.BookShop;
import ShopEntities.Customer;
import ShopEntities.Form;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookShop bs = BookShop.getInstance();
        BookFormatStrategy eBook = new EBook();
        BookFormatStrategy paper = new Paper();
        BookFormatStrategy pdf = new PDF();

        Book fan1 = new Book("Harry Potter", "J.K.Rowling", 700, BookType.FANTASY, bs, eBook);
        Book fan2 = new Book("The Return of the King", "J.R.R. Tolkien", 900,
                BookType.FANTASY, bs, eBook);

        Book det1 = new Book("A Case of Identity", "A.C. Doyle", 300,
                BookType.DETECTIVE, bs, eBook);
        Book det2 = new Book("The Adventure of the Blue Carbuncle", "A.C. Doyle", 350,
                BookType.DETECTIVE, bs, eBook);

        Book ran1 = new Book("Yahari Ore no Seishun Love Come wa Machigatteiru", "Wataru Watari",
                340, BookType.RANOBE, bs, pdf);
        Book ran2 = new Book("Utsuro no Hako to Zero no Maria", "Eiji Mikage", 300,
                BookType.RANOBE, bs, pdf);

        Book th1 = new Book("It", "Stephen King", 800, BookType.THRILLER, bs, eBook);
        Book th2 = new Book("Gone Girl", "Gillian Flynn", 750, BookType.THRILLER, bs, paper);

        fan1.nextPage();
        det2.close();
        System.out.println();

        List<Book> detectives = bs.getBooks(BookType.DETECTIVE);    // search for specific category
        printBookList("Detectives: ", detectives);  // find detectives

        Customer customerLuiz = new Customer("Luiz", "343-56-56");
        Customer customerSubham = new Customer("Subham", "888-66-63");
        Customer customerLeonid = new Customer("Leonid", "852-96-41");

        printBookList("Found books:", bs.getBooks("Yahari Ore no Seishun Love Come wa Machigatteiru"));

        Form form = new Form(th1, customerLuiz);
        bs.buyBook(form);     // submit form for booking to the book shop

        Form form2 = new Form(ran1, customerSubham);
        bs.buyBook(form2);

        Form form3 = new Form(det2, customerLeonid);
        bs.buyBook(form3);

        printFormList("Current bookings in book shop:", bs.getForms());

        printBookList("Booked by Luiz:", customerLuiz.getAllBooks());
    }

    private static void printBookList(String message, List<Book> list) {
        System.out.println(message);
        for (Book book : list)
            System.out.println(book.toString());
        System.out.println();
    }

    private static void printFormList(String message, List<Form> list) {
        System.out.println(message);
        for (Form form : list)
            System.out.println(form.toString());
        System.out.println();
    }
}
