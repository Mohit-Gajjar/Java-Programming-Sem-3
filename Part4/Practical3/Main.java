package Part4.Practical3;

public class Main {

    static void meth1() {
        try {
            System.out.println("method 1");
            throw new ArithmeticException();
        }

        finally {
            System.out.println("finally of method 1");
        }
    }

    static void meth2() {
        try {
            System.out.println("Method 2");
            return;
        }

        finally {
            System.out.println("finally of method 2");
        }
    }

    public static void main(String args[]) {
        try {
            meth1();
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        }

        meth2();
        try {
            System.out.println("Normal Statement");
        } catch (Exception e) {
            System.out.println("Exception is:" + e);
        } finally {
            System.out.println("finally of main() method.");
        }

    }
}