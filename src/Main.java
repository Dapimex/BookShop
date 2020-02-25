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
        System.out.println("DETECTIVES: ");
        printBookList(detectives);  // find detectives
        System.out.println();

        Customer customer = new Customer("Luiz", "343-56-56");

        Form form = new Form(th1, customer, 7);
        bs.bookBooks(form);     // submit form for booking to the book shop


    }

    private static void printBookList(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

    private static void printForm(Form form) {
        System.out.println(form.toString());
    }
}
