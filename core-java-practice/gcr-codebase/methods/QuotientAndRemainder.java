//Write a program to take 2 numbers and print their quotient and reminder

//importing Scanner class
import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
         // User input
        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        
		// closing input
		input.close();
	}

	// Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { quotient, remainder };
    }
}