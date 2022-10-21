
package Part1.Practical3;

public class Main {
    static boolean firstDigit(int a, int b) {
        if (findfirstDigit(a) == findfirstDigit(b)) {
            return true;
        } else
            return false;
    }

    public static int findfirstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(firstDigit(2, 27));
    }
}
