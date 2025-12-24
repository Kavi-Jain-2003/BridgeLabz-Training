//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

//importing scanner class
import java.util.Scanner;

public class MultiplicationResult {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number from 6 to 9:");
		int number=input.nextInt();
		// creating array
		int[] multiplicationResult = new int[10];
		for(int i=1; i<=10; i++)
		{
		    multiplicationResult[i-1]=number*i;
		}
		for(int i=1; i<=10; i++)
		{
		    System.out.println(number+"*"+i+"="+multiplicationResult[i-1]);
		}
		// closing input
		input.close();
	}
}
