
//Number Guessing Game:Write a Java program where the user thinks of a number between 1 and 100, and the computer tries to guess the number by generating random guesses.
//importing Scanner class
import java.util.Scanner;

public class MaxOfThreeNumbers {
	// scanner object
	static Scanner input = new Scanner(System.in);
	static int num1, num2, num3;

	public static void main(String[] args) {

		// user input
		takeInput();
		int maximum = maxOfThree();
		System.out.println("maximum no. is:" + maximum);
		// close input
		input.close();
	}

	public static void takeInput() {
		System.out.println("Enter three numbers:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

	}

	public static int maxOfThree() {
		int max = 0;
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num3 && num2 > num1) {
			max = num2;
		} else {
			max = num3;
		}
		return max;
	}
}