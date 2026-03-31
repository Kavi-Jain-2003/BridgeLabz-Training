//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

//importing Scanner class for input
import java.util.Scanner;

public class ReportCardArray {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		// Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Arrays to store marks
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];

        // Arrays to store percentage and grade
        double[] percentage = new double[students];
        String[] grade = new String[students];

        // Input marks with validation
        for (int i = 0; i < students; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextInt();

            System.out.print("Maths: ");
            maths[i] = input.nextInt();

            // Validation for negative marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
				// decrement index to re-enter same student data
                i--;  
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {

            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Display result
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks: " + physics[i]);
            System.out.println("Chemistry Marks: " + chemistry[i]);
            System.out.println("Maths Marks: " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

		//closing input
        input.close();
		
    }
}