
//Student Score Analyser
//importing Scanner class
import java.util.Scanner;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class StudentScoreAnalyser {
    public static void main(String[] args) throws InvalidScoreException {
        // Scanner object
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.println("enter no. of students:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Enter marks " + (i + 1));
                    marks[i] = sc.nextInt();
                    if (marks[i] < 0 || marks[i] > 100) {
                        throw new InvalidScoreException("You enetered wrong marks:" + marks[i]);
                    }
                    break;
                } catch (InvalidScoreException ex) {
                    System.out.println(ex.getMessage());

                } catch (Exception ex) {
                    System.out.println("please enter a number");
                    sc.next();
                }
            }

        }
        calculateAverage(marks);
        findMax(marks);
        findMin(marks);

        // closing input
        sc.close();
    }

    public static void calculateAverage(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double avg = (double) sum / marks.length;
        System.out.println("Average mrks:" + avg);
    }

    public static void findMax(int[] marks) {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("max marks=" + max);
    }

    public static void findMin(int[] marks) {
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("min marks=" + min);
    }

}