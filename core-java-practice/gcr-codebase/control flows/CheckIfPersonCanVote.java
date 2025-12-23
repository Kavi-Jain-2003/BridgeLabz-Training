//Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
//importing Scanner class
import java.util.Scanner;
public class CheckIfPersonCanVote
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter age:");
	    int age=input.nextInt();
		//checking age greater than or equal to 18 and printing output
		if(age>=18)
		{
			System.out.println("The person's age is "+age+" and can vote");
		}
		else
		{
		    System.out.println("The person's age is "+age+ "and cannot vote");
		}		
		//closing input
		input.close();
	}
}