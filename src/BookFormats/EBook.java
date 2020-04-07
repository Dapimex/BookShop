package BookFormats;

public class EBook implements BookFormat {

    public void nextPage() {
        System.out.println("Tap button to open next page");
    }

    public void closeBook() {
        System.out.println("Close E-book Reader");
    }

}
