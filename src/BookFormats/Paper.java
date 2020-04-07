package BookFormats;

public class Paper implements BookFormat {

    public void getInfo() {
        System.out.println("Read info about Paper Book");
    }

    public void nextPage() {
        System.out.println("Turn over the page");
    }

    public void closeBook() {
        System.out.println("Close paper book");
    }

}
