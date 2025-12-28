//Create a program to take input marks of students in 3 subjects: physics, chemistry, and maths. Compute the total, average, and the percentage score

//importing scanner class
import java.util.Random;
import java.util.Scanner;

public class StudentScoreCardMethod {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        // Generate marks
        int[][] marks = generateMarks(numStudents);

        // Calculate results
        double[][] results = calculateResults(marks);

        // Display scorecard
        displayScoreCard(marks, results);
		//closing input
		sc.close();
	}
// Method to generate random 2-digit marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int numStudents) {
        int[][] marks = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 10 + rand.nextInt(91); // Physics: 10 to 100
            marks[i][1] = 10 + rand.nextInt(91); // Chemistry
            marks[i][2] = 10 + rand.nextInt(91); // Maths
        }

        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // [total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    (int)results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }


}