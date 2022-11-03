
package Part1.Practical5;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter no of rows: ");
            int rows = scanner.nextInt();
            MakeTriangle t1 = new MakeTriangle();
            System.out.println("Total no of blocks: " + t1.makeTriangle(rows));
        }
    }

}
