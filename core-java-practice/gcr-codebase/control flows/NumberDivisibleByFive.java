//Write aprogram to check if a number is divisible by 5

//importing Scanner class
import java.util.Scanner;
public class NumberDivisibleByFive
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number:");
	    int number=input.nextInt();
		//calculating multiples of 5
		boolean result=(number%5==0);
		//displaying output
		System.out.println("Is the number "+number+" divisible by 5? "+result);
		//closing input
		input.close();
	}
}