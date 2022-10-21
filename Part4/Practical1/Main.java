package Part4.Practical1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("mohit");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int a = 9 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
            arr[12] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            Class.forName("Class1");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            File file = new File("c://mohit.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
