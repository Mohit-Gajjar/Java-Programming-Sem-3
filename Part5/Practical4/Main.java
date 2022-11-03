package Part5.Practical4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("F:\\College\\Java\\Practicals\\Part5\\Practical4\\testing.txt");

            // reading from the file character by character
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                System.out.println((char) temp);
            }

        } finally {
            // closing stream as no longer in use
            if (sourceStream != null) {
                sourceStream.close();
            }

        }

        System.out.println("ID : D22CE163 \nName : Mohit Gajjar");
    }
}
