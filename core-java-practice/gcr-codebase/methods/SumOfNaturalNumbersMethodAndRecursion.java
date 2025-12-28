//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 

//importing Scanner class
import java.util.Scanner;

public class SumOfNaturalNumbersMethodAndRecursion {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		System.out.println("Enter a number:");
		int number = input.nextInt();
		if(number>0)
		{
			System.out.println("you entered a natural no.");
			int sumUsingMethod=sumViaFormula(number);
			int sumUsingRecursion=sumViaRecursion(number);
			if(sumUsingMethod==sumUsingRecursion)
			{
				System.out.println("both sum are equal");
			}
			else
			{
				System.out.println("both sum are different");
			}
		}
		else
		{
			System.out.println("invalid no.");
		}
			
		// closing input
		input.close();
	}

	// Method to calculate factors
	public static int sumViaFormula(int number) {

		int sum=number*(number+1)/2;
		return sum;
	}
	public static int sumViaRecursion(int number) {

		 // Base case
        if (number == 1) {
            return 1;
        }

        // Recursive call
        return number + sumViaRecursion(number - 1);
	}
}