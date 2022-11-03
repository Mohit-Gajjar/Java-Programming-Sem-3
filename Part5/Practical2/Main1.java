package Part5.Practical2;

import java.io.*;

public class Main1

{
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        try {
            sourceStream = new FileInputStream("F:\\College\\Java\\Practicals\\Part5\\Practical2\\test.txt");
            targetStream = new FileOutputStream("F:\\College\\Java\\Practicals\\Part5\\Practical2\\test1.txt");

            // reading from character.txt and writing into byte.txt and printing the byte in
            // the program
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                System.out.println((byte) temp);
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
