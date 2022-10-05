package Part2.Practical2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1);
        System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
        System.out.println("Monthly interest rate: " + account.getMonthlyInterest());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Id: " + account.getId());
        System.out.println("Account created date: " + account.getDateCreated());
        account.deposit(500);
        System.out.println("Account Balance: " + account.getBalance());
        account.widhraw(300);
        System.out.println("Account Balance: " + account.getBalance());

    }
}
