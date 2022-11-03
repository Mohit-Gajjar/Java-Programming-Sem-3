package Part6.Practical1;

public class ActualMain {
    public static void main(String args[]) {
        Main pobj1 = new Main();
        Thread t1 = new Thread(pobj1, "Thread 1");

        System.out.println("Creating Thread by extending Thread Class.");
        t1.start();

        Practical1Implements pobj2 = new Practical1Implements();
        Thread t2 = new Thread(pobj2, "Thread 2");

        System.out.println();
        System.out.println("Creating Thread by implementing Runnable Interface.");
        t2.start();
    }
}
