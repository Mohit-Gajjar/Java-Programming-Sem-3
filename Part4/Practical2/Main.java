package Part4.Practical2;

public class Main {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Your under 18");
        } else
            System.out.println("You are above 18");
    }

    public static void main(String[] args) {
        checkAge(21);
        checkAge(12);
    }
}
