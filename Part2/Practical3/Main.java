package Part2.Practical3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> al = new ArrayList<Account>();
        for (int i = 1; i <= 10; i++) {
            if (i == 9) {
                i++;
                al.add(new Account("ACC0" + i));
            } else
                al.add(new Account("ACC00" + i));

        }
        final Iterator iterator = al.iterator();
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("1. Balance inquiry");
                System.out.println("2. Withdraw money");
                System.out.println("3. Deposit money");
                System.out.println("4. Money transfer");
                System.out.println("5. Create account");
                System.out.println("6. Deactivate account");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int checker = scanner.nextInt();
                switch (checker) {
                    case 1:
                        System.out.print("Enter Account number: ");
                        String accno = scanner.next();
                        System.out.println(accno);
                        System.out.println();
                        break;

                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;

                    default:
                        break;
                }
            }

            System.out.println("Transaction completed successfully");
            System.out.println("______Thank you for using our service!!!______");

        }
    }
}