package Part3.Practical4;

import java.util.*;

public class MethodOverriding {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);
        int a, b;
        System.out.print("Enter Value of a : ");
        a = sobj.nextInt();

        System.out.print("Enter Value of b : ");
        b = sobj.nextInt();

        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassB();
        ClassB bobj = new ClassB();

        aobj1.setA(a);
        bobj.setB(b);

        System.out.println();
        aobj1.display();
        bobj.display();

        System.out.println();
        System.out.println("ID : D22CE163 \nName : Mohit Gajjar");
    }
}
