package Part2.Practical4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1);
        account.setBalance(500);
        account.setDate(new Date());
        System.out.println(account);
    }
}
