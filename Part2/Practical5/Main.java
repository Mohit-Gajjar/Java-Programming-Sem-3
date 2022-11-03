package Part2.Practical5;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        int side1, side2, side3;

        System.out.print("Enter Length [3 sides] : ");

        side1 = sobj.nextInt();
        side2 = sobj.nextInt();
        side3 = sobj.nextInt();
        MethodOverloading mobj = new MethodOverloading();
        mobj.setSide1(side1);
        mobj.setSide2(side2);
        mobj.setSide3(side3);

        MethodOverloading pobj2 = new MethodOverloading(side1, side2, side3);

        System.out.println();
        System.out.println("ID : D22CE163\nName : Mohit Gajjar");
    }
}
