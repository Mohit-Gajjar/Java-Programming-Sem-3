package Part1.Practical2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the mobile number in '+91-AA-BBB-CCCCC' format: ");
            String number = sc.next();
            if (number.length() == 16) {
                Generate g = new Generate();
                g.generate(number);

            } else {
                System.out.println("Invalid number!!");
            }
        }

    }

}

class Generate {
    void generate(String number) {
        String[] systemOperator = number.split("-", 4);
        System.out.println("Mobile System Operator: " + systemOperator[1].replace("+", ""));
        System.out.println("MSC: " + systemOperator[2]);
        System.out.println("Unique code: " + systemOperator[3]);

    }
}