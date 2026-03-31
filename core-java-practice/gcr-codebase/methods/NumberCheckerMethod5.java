//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

//importing scanner class
import java.util.Scanner;

public class NumberCheckerMethod5 {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		// Perfect number check
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is NOT a Perfect Number");
        }

        // Abundant number check
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        // Deficient number check
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number");
        } else {
            System.out.println(number + " is NOT a Deficient Number");
        }

        // Strong number check
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number");
        } else {
            System.out.println(number + " is NOT a Strong Number");
        }

		//closing input
		input.close();
	}
	 // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
	  // Perfect number check
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum == number;
    }

    // Abundant number check
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum > number;
    }

    // Deficient number check
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfProperDivisors(number);
        return sum < number;
    }

    // Strong number check
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}