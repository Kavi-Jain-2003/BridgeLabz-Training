//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

//importing scanner class
import java.util.Scanner;

public class StudentVote {
	// creating Scanner object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// user input
		System.out.println("enter no. of students:");
		int n = input.nextInt();
		int[] ages = ageOfStudents(n);
		String[][] agesCanVote = studentCanVoteOrNot(ages);
		displayResult(agesCanVote);

		// closing the input
		input.close();
	}

	public static int[] ageOfStudents(int n) {
		// taking ages input
		int[] ages = new int[n];
		System.out.println("enter " + n + " ages:");
		for (int i = 0; i < n; i++) {
			ages[i] = input.nextInt();
		}
		return ages;
	}

	// method to check eligibility
	public static String eligibleOrNot(int age) {
		if (age < 0) {
			return "invalid";
		} else if (age >= 18) {
			return "true";
		} else {
			return "false";
		}
	}
//2d array ages with eligibility
	public static String[][] studentCanVoteOrNot(int[] ages) {
		String[][] agesCanVote = new String[ages.length][2];
		for (int i = 0; i < ages.length; i++) {
			agesCanVote[i][0] = String.valueOf(ages[i]);
			agesCanVote[i][1] = eligibleOrNot(ages[i]);
		}
		return agesCanVote;
	}
//to display
	public static void displayResult(String[][] agesCanVote) {
		for (int i = 0; i < agesCanVote.length; i++) {
			System.out.println(agesCanVote[i][0] + "\t\t" + agesCanVote[i][1]);
		}
	}
}