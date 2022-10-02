package Part1.Practical4;

public class CheckCorrect {
    String key = "DBDCCDAEAD";
    char[] noOfCorrectAns;
    char[] correctAnsIndex;

    public CheckCorrect(char[][] input) {
        for (int i = 0; i < 8; i++) {
            int correctAns = 0;
            System.out.println("==========================");
            System.out.println("For Student No. " + 1);
            for (int j = 0; j < 10; j++) {
                if (key.charAt(j) == input[i][j]) {
                    correctAns++;
                }
            }
            System.out.println("Marks out of 10: " + correctAns);
            System.out.println("==========================");
        }
    }
}
