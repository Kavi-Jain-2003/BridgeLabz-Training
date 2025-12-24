//Write a program FizzBuzz, 

//importing scanner class
import java.util.Scanner;

public class FizzBuzzArray {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = input.nextInt();
		String[] FizzBuzz = new String[number];

		if (number < 0) {
			System.out.println("invalid no.");
			input.close();
			return;
		}

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				FizzBuzz[i - 1] = "FizzBuzz";
			} else if (i % 3 == 0) {
				FizzBuzz[i - 1] = "Fizz";
			} else if (i % 5 == 0) {
				FizzBuzz[i - 1] = "Buzz";
			} else {
				FizzBuzz[i - 1] = String.valueOf(i);
			}
		}
		// Display 1D array
		System.out.println("Array elements:");
		for (int i = 0; i < FizzBuzz.length; i++) {
			System.out.println("Position " + (i + 1) + " = " + FizzBuzz[i]);
		}
		// closing input
		input.close();
	}
}
