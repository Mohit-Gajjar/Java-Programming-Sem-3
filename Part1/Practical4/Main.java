
package Part1.Practical4;

public class Main {

    public static void main(String[] args) {
        char[][] studentAnswers = {
                { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' },
                { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' },
                { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' },
                { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' },
                { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' },
                { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' },
                { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' },
                { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' },
        };

        new CheckCorrect(studentAnswers);
    }
}
