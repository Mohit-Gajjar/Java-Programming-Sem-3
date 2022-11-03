package Part7.Practical3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creating arraylist
        ArrayList<Account> ah = new ArrayList<>();
        int i = 1;
        // loop to add account holder details while(i<6)
        {
            System.out.print("\nEnter Details of Account Holder " + i + " :\n");
            System.out.print("Enter Age : ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();

            System.out.print("Enter Net Monthly Income : ");
            double income = input.nextDouble();

            System.out.print("Enter work experience in years : ");
            float experience = input.nextFloat();

            System.out.print("Enter name of your country : ");
            String citizenship = input.next();

            ah.add(new Account(age, income, experience, citizenship));
            i++;
        }

        // prints if the account is eligible or not and its details if it is eligible
        for (int j = 1; j < ah.size() + 1; j++) {
            System.out.println("\nAccount Holder " + j + " is " + ((Account) ah.get(j - 1)).eligiblity());
        }

        System.out.println("\nID : D22CE163 \nName : Mohit Gajjar");
    }
}
