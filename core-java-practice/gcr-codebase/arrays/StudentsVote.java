//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//importing scanner class
import java.util.Scanner;

public class StudentsVote {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		// creating array
		int[] studentAge = new int[10];
		// taking array elements from user
		System.out.println("Enter array elements:");
		for (int i = 0; i < studentAge.length; i++) {
			studentAge[i] = input.nextInt();
		}
		//loop to find positive and valid ages to vote
		for (int i = 0; i < studentAge.length; i++) {
			if (studentAge[i] < 0) {
				System.out.println("Invalid age");
			} else {
				if (studentAge[i] >= 18) {
					System.out.println("Student with the age " + studentAge[i] + " can vote");
				} else {
					System.out.println("Student with the age " + studentAge[i] + " cannot vote");
				}
			}
		}
		// closing input
		input.close();
	}
}
