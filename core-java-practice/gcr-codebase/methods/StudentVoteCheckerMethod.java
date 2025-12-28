//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

//importing Scanner class
import java.util.Scanner;

public class StudentVoteCheckerMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		int[] ages=new int[10];
		System.out.println("Enter 10 ages:");
		
		// Loop to take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            ages[i] = input.nextInt();

            boolean canVote = canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student with age " + ages[i] + " can vote");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote");
            }
        }
		// closing input
		input.close();
	}

	// Method to check if a student can vote
    public static boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}