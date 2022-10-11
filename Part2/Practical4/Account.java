package Part2.Practical4;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 300;
    private double annualInterestRate = 0.07;
    private Date dateCreated;

    public Account(int i) {
        this.id = i;
        balance = 500;
        annualInterestRate = 0.07;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDate(Date date) {
        this.dateCreated = date;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestedRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return getAnnualInterestRate() / 100 * balance;
    }

    public void widhraw(double balance) {
        this.balance -= balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    @Override
    public String toString() {
        return "Account ID: " + id + "\n" + "Balance: " + getBalance() + "\n" + "Date Created: " + getDateCreated()
                + "\n" + "Annual Interest Rate: " + getMonthlyInterest();
    }
}
