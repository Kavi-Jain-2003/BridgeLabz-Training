//Write a program to check for the natural number and write the sum of n natural numbers 

//importing Scanner class
import java.util.Scanner;
public class CheckAndSumNaturalNumbers
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number:");
	    int number=input.nextInt();
		//checking for natural numbers and calculating sum
		if(number>0)
		{
		    int naturalNumberSum=number*(number+1)/2;
			System.out.println("The sum of "+number+" natural number is "+naturalNumberSum);
		}
		else
		{
		    System.out.println("The number "+number+" is not a natural number");
		}
		//closing input		
		input.close();
	}
}