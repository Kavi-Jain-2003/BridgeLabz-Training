//Write aprogram to check if the first is the smallest of the 3 numbers

//importing Scanner class
import java.util.Scanner;
public class NumberSmallestOfTheThreeNumbers
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number1:");
	    int number1=input.nextInt();
		System.out.println("Enter number2:");
		int number2=input.nextInt();
		System.out.println("Enter number3:");
		int number3=input.nextInt();
		//finding smallest
		boolean result=(number1<number2&&number1<number3);
		//displaying output
		System.out.println("Is the first number the smallest? "+result);
		//closing input
		input.close();
	}
}