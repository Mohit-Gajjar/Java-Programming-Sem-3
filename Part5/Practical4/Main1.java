package Part5.Practical4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("F:\\College\\Java\\Practicals\\Part5\\Practical4\\testing.txt");
            targetStream = new FileOutputStream("F:\\College\\Java\\Practicals\\Part5\\Practical4\\copy.txt");

            // reading from Practical_5_4.txt and writing in copy.txt and printing the byte
            // in the program
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                targetStream.write((byte) temp);
            }

        } finally {
            // closing the file if it is null if (sourceStream != null)
            {
                sourceStream.close();
            }

            if (targetStream != null) {
                targetStream.close();
            }

        }
        System.out.println("ID : D22CE163 \nName : Mohit Gajjar");

    }
}
