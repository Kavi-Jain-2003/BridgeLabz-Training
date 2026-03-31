
//importing scanner class
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//custom exception
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class OnlineQuiz {

    // scanner object
    static Scanner sc = new Scanner(System.in);
    static List<Integer> allScores = new ArrayList<>();

    public static void main(String[] args) {

        String[] correctAnswers={"A","b","c","D","A"};
        System.out.println("Enter no. of users:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int u = 0; u < n; u++) {
            System.out.println("\nUser " + (u + 1) + " submission:");

            String[] userAnswers = new String[correctAnswers.length];
            for (int i = 0; i < correctAnswers.length; i++) {
                System.out.print("Answer for question " + (i + 1) + ": ");
                userAnswers[i] = sc.nextLine().toUpperCase().trim(); // standardize input
            }

            try {
                int score = calculateScore(correctAnswers, userAnswers);
                allScores.add(score);
                System.out.println("Score: " + score + "/" + correctAnswers.length);
                System.out.println("Grade: " + determineGrade(score, correctAnswers.length));
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("Error: " + e.getMessage());
                u--; // retry this user
            }
        }

         // Print all scores
        System.out.println("\nAll users' scores: " + allScores);
        sc.close();

    }
    // Method to calculate score
    public static int calculateScore(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Number of answers does not match the quiz length!");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    // Method to determine grade based on score
    public static String determineGrade(int score, int totalQuestions) {
        double percentage = ((double) score / totalQuestions) * 100;

        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else return "F";
    }
}

