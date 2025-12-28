//Write a program to find the sum of n natural numbers using loop

//importing Scanner class
import java.util.Scanner;

public class SumOfNaturalNumbersMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter no. of natural numbers:");
        int n = input.nextInt();
		//output
		int sum=sumOfNaturalNumbers(n);
        System.out.println("Sum of "+n+" natural no.s is:"+sum);
		// closing input
		input.close();
	}

	//sum of natural nummbers
	public static int sumOfNaturalNumbers(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
		sum+=i;
		}
		return sum;
	}
}