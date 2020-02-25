import java.util.List;

public class Main {

    public static void main(String[] args) {

        BookShop bs = new BookShop();
        BookFactory bookFactory = new BookFactory();

        Book fan1 = bookFactory.getBook("Harry Potter", "J.K.Rowling", 700, BookType.FANTASY, bs);
        Book fan2 = bookFactory.getBook("The Return of the King", "J.R.R. Tolkien", 900,
                BookType.FANTASY, bs);

        Book det1 = bookFactory.getBook("A Case of Identity", "A.C. Doyle", 300,
                BookType.DETECTIVE, bs);
        Book det2 = bookFactory.getBook("The Adventure of the Blue Carbuncle", "A.C. Doyle", 350,
                BookType.DETECTIVE, bs);

        Book ran1 = bookFactory.getBook("Yahari Ore no Seishun Love Come wa Machigatteiru", "Wataru Watari",
                340, BookType.RANOBE, bs);
        Book ran2 = bookFactory.getBook("Utsuro no Hako to Zero no Maria", "Eiji Mikage", 300,
                BookType.RANOBE, bs);

        Book th1 = bookFactory.getBook("It", "Stephen King", 800, BookType.THRILLER, bs);
        Book th2 = bookFactory.getBook("Gone Girl", "Gillian Flynn", 750, BookType.THRILLER, bs);

        List<Book> detectives = bs.getBooks(BookType.DETECTIVE);    // search for specific category
        printBookList("DETECTIVES: ", detectives);  // find detectives

        Customer customerLuiz = new Customer("Luiz", "343-56-56");
        Customer customerSubham = new Customer("Subham", "888-66-63");
        Customer customerLeonid = new Customer("Leonid", "852-96-41");

        Form form = new Form(th1, customerLuiz, 7);
        bs.bookBooks(form);     // submit form for booking to the book shop

        Form form2 = new Form(ran1, customerSubham, 14);
        bs.bookBooks(form2);

        Form form3 = new Form(det2, customerLeonid, 2);
        bs.bookBooks(form3);

        printFormList("CURRENT BOOKINGS IN BOOK SHOP:", bs.getForms());

        printBookList("LUIZ BOOKED:", customerLuiz.booksBooked);

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
