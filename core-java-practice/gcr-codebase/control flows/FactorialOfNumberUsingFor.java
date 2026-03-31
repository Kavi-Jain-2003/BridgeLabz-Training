//Write a Program to find the factorial of an integer entered by the user using for loop.

//importing Scanner class for input
import java.util.Scanner;

public class FactorialOfNumberUsingFor {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter number:");
       int number=input.nextInt();
	   int factorial=1;
	   //calculating factorial
	   if(number>=0)
	   {
	       System.out.println("user entered a positive number");
		   for(int i=1; i<=number; i++)
		   {
		       factorial=factorial*i;
		    }
			// display sum outside the loop
        System.out.println("Factorial Of "+number+" is = "+factorial);
		}
		else
		{
		    System.out.println("please enter a positive number");
		}        
		//closing input
        input.close();
    }
}
