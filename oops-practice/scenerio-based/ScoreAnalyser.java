//. Scenario: Develop a program to manage student test scores.
//importing scanner class
import java.util.Scanner;

class ScoreAnalyser {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
        System.out.println("enter no. of students:");
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Number of students must be numeric.");
            input.close();
            return;
        }

        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Number of students must be greater than 0.");
            input.close();
            return;
        }
//user input
        int[] score = new int[n];
        System.out.println("enter score of" + n + " students:");
        for (int i = 0; i < n; i++) {
           if(!input.hasNextInt()) {
                System.out.println("Invalid input. Scores must be numeric.");
                input.close();
                return;
            }

            score[i] = input.nextInt();

            if (score[i] < 0) {
                System.out.println("Invalid score. Score cannot be negative.");
                input.close();
                return;
            }
        }
        avgScore(score);
        highestAndLowestScore(score);

        // closing input
        input.close();
    }

    // avg score and score greater than avg
    public static void avgScore(int[] score) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        float avg = (float) sum / score.length;
        System.out.println("Average score:" + avg);
        System.out.println("Scores greater than average:" );
        for (int i = 0; i < score.length; i++) {
            if (score[i] > avg) {
                System.out.println(score[i]);
            }
        }
    }

    // highest and lowest score
    public static void highestAndLowestScore(int[] arr) {
        int highest = arr[0];
        int lowest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        System.out.println("Highest score:" + highest);
        System.out.println("Lowest score:" + lowest);
    }

}
