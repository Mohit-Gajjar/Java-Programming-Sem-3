// We have triangle made of blocks. The topmost row has 1 block, the next row down 
// has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops 
// or multiplication) the total number of blocks in such a triangle with the given number 
// of rows.
// triangle(0) → 0
// triangle(1) → 1
// triangle(2) → 3

package Part1.Practical5;

import java.util.Scanner;

import Part1.Practical5.Practical5.MakeTriangle;

public class Practical5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter no of rows: ");
            int rows = scanner.nextInt();
            MakeTriangle t1 = new MakeTriangle();
            System.out.println("Total no of blocks: " + t1.makeTriangle(rows));
        }
    }

}
