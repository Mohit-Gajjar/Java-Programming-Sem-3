package Part6.Practical1;

public class Main extends Thread {

    public void run() {
        try {
            System.out.println("Hello World!");
            Thread.sleep(250);
        } catch (Exception e) {
            System.out.println("Exception occured!");
        }
    }
}
