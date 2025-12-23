//Write a program to check whether a number is positive, negative, or zero.
//importing Scanner class
import java.util.Scanner;
public class CheckIfNumberIsPositiveOrNot
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number:");
	    int number=input.nextInt();
		//checking whether no. is positive or not
		if(number>0)
		{
			System.out.println("The number "+number+" is positive");
		}
		else if(number<0)
		{
		    System.out.println("The number "+number+" is negative");
		}
		else
		{
			System.out.println("The number "+number+" is zero");			
		}		
		//closing input
		input.close();
	}
}