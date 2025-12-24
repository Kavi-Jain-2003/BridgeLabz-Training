//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors

//importing scanner class
import java.util.Scanner;

public class FactorsOfArray {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);

		System.out.println("enter a number:");
		int number = input.nextInt();
		if (number <= 0) {
			System.out.println("error:you entered a non natural no.:");
			input.close();
			return;
		}
		int maxFactor = 10;
		// creating array
		int[] factors = new int[maxFactor];
		int index = 0;

		// finding factors
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {

				// if array is full, increase size
				if (index == maxFactor) {

					// double the size
					maxFactor = maxFactor * 2;

					// create temporary array
					int[] temp = new int[maxFactor];

					// copy old elements to new array
					for (int j = 0; j < index; j++) {
						temp[j] = factors[j];
					}

					// assign new array to factors
					factors = temp;
				}

				// store factor
				factors[index] = i;
				index++;
			}
		}

		// display factors
		System.out.println("Factors of " + number + " are:");
		for (int i = 0; i < index; i++) {
			System.out.println(factors[i]);
		}

		// closing input
		input.close();
	}
}
