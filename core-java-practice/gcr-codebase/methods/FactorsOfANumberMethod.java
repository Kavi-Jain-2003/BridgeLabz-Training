//Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results

//importing Scanner class
import java.util.Scanner;

public class FactorsOfANumberMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		System.out.println("Enter a number:");
		int number = input.nextInt();

		// Method calls
		int[] factors = calculateFactors(number);

		// Display factors
		System.out.print("Factors: ");
		for (int factor : factors) {
			System.out.print(factor + " ");
		}

		System.out.println("\nSum of factors: " + sumOfFactors(factors));
		System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));
		System.out.println("Product of factors: " + productOfFactors(factors));

		// closing input
		input.close();
	}

	// Method to calculate factors
	public static int[] calculateFactors(int number) {

		// First loop → count factors
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		int[] factors = new int[count];
		int index = 0;
		// Second loop → store factors
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index] = i;
				index++;
			}
		}
		return factors;
	}

	// Method to calculate sum of factors
	public static int sumOfFactors(int[] factor) {
		int sum = 0;
		for (int i = 0; i < factor.length; i++) {
			sum += factor[i];

		}
		return sum;
	}

	// Method to calculate sum of squares of factors
	public static int sumOfSquareOfFactors(int[] factors) {
		int sum = 0;
		for (int factor : factors) {
			sum += Math.pow(factor, 2);
		}
		return sum;
	}

	// Method to calculate product of factors
	public static int productOfFactors(int[] factor) {
		int product = 1;
		for (int i = 0; i < factor.length; i++) {
			product *= factor[i];

		}
		return product;
	}

}