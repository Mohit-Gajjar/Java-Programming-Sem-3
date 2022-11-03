package Part5.Practical2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;
        try {
            sourceStream = new FileReader("F:\\College\\Java\\Practicals\\Part5\\Practical2\\test.txt");
            // reading from the file character by character
            int temp;
            while ((temp = sourceStream.read()) != -1) {
                System.out.println((char) temp);
            }
        } finally {
            // closing stream
            if (sourceStream != null) {
                sourceStream.close();
            }
        }
        System.out.println("ID : D22CE163 \nName : Mohit Gajjar");
    }
}