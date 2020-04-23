package BookFormatStrategies;

public class Paper implements BookFormatStrategy {

    public void nextPage() {
        System.out.println("Turn over the page");
    }

    public void closeBook() {
        System.out.println("Close paper book");
    }

}
