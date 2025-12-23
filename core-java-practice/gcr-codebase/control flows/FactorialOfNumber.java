//Write a Program to find the factorial of an integer entered by the user.

//importing Scanner class for input
import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		int number = input.nextInt();
		int factorial = 1;
		if (number >= 0) {
			System.out.println("you entered a positive number");
			int i = 1;
			while (i <= number) {
				factorial = factorial * i;
				i++;
			}
			// display sum outside the loop
			System.out.println("Factorial Of " + number + " is = " + factorial);
		} else {
			System.out.println("please enter a positive number");
		}
		input.close();
	}
}
