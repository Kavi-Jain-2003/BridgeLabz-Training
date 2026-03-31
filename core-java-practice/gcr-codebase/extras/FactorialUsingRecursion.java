//Factorial Using Recursion:Write a program that calculates the factorial of a number using a recursive function.
//importing Scanner class
import java.util.Scanner;

public class FactorialUsingRecursion {
	// scanner object
	static Scanner input = new Scanner(System.in);
	static int number;

	public static void main(String[] args) {
		//user input
		userInput();
		int factorial = calculateFactorial(number);
		result(factorial);
		// closing input
		input.close();
	}

	public static void userInput() {
		// user input
		System.out.println("enter a number for factorial:");
		number = input.nextInt();
	}

	// palindrome check
	public static int calculateFactorial(int number) {
		if(number==0||number==1)
			{
				return 1;
			}
			return number*calculateFactorial(number-1);
	}

	public static void result(int factorial) {
		
		System.out.println("Factorial of "+number+" is:"+factorial);
		
	}
}
