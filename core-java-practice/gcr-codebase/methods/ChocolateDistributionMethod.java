//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

//importing Scanner class
import java.util.Scanner;

public class ChocolateDistributionMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter number of chocolates:");
        int numberOfChocolates = input.nextInt();

        System.out.println("Enter number of children:");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
        
		// closing input
		input.close();
	}

	// Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;   // chocolates per child
        int remainder = number % divisor;  // remaining chocolates

        return new int[] { quotient, remainder };
    }
}