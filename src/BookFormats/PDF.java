package BookFormats;

public class PDF implements BookFormat {

    public void nextPage() {
        System.out.println("Scroll text to the next page");
    }

    public void closeBook() {
        System.out.println("Close PDF Reader");
    }

}
