package Part5.Practical3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // creating a file
        File f1 = new File("created.txt");
        f1.createNewFile();

        // creating an object for reading and writing the file
        FileInputStream input = new FileInputStream("created.txt");
        FileOutputStream output = new FileOutputStream("copy.txt");

        int temp;

        // copying from first file and writing in another file
        while ((temp = input.read()) != -1) {
            output.write((char) temp);
        }

        // closing both the files output.close(); input.close();

        System.out.println("ID : D22CE163 \nName : Mohit Gajjar");
    }
}
