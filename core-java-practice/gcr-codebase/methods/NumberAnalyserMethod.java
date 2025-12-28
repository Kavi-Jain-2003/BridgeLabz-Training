//Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

//importing Scanner class
import java.util.Scanner;

public class NumberAnalyserMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		  // Array to store 5 numbers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Input and checks
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextInt(); 
			//check Positive or negative
			if(isPositive(numbers[i]))
			{
				//if positive ,check for even or odd
				if(isEVenOrOdd(numbers[i]))
				{
					System.out.println(numbers[i]+" is positive and even");
				}
				else
				{
					System.out.println(numbers[i]+" is positive and odd");
				}
			}
			else
			{
				System.out.println(numbers[i]+" is negative");
			}
		}
		 // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("\nFirst element is greater than last element");
        } else if (result == 0) {
            System.out.println("\nFirst element is equal to last element");
        } else {
            System.out.println("\nFirst element is less than last element");
        }

		// closing input
		input.close();
	}

	 // Method to check positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check even or odd
    public static boolean isEVenOrOdd(int number) {
        return number % 2 == 0;
    }
	//to compare first and last elements
	public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}