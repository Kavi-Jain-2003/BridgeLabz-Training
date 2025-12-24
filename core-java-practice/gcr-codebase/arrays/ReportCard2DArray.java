//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

//importing Scanner class for input
import java.util.Scanner;

public class ReportCard2DArray {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		// Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // 2D array to store marks
        // Column 0 -> Physics, 1 -> Chemistry, 2 -> Maths
        int[][] marks = new int[students][3];

        // Arrays to store percentage and grade
        double[] percentage = new double[students];
        String[] grade = new String[students];

        // Take marks input with validation
        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            // Validation for negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--;   // re-enter same student details
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else if (percentage[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        // Display result
        for (int i = 0; i < students; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

		//closing input
        input.close();
		
    }
}