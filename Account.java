import java.util.Date;

public class Account {
    private String id = "AC000";
    private double balance = 300;
    private double annualInterestRate = 0.07;
    private Date dateCreated;

    Account(String i) {
        this.id = i;
        balance = 500;
        annualInterestRate = 0.07;
        dateCreated = new Date();
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getAnnualInterestRate() / 100 * balance;
    }

    public void widhraw(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance = balance;
    }
}
