//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

//importing Scanner class for input
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
		//creating scanner object
        Scanner input = new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number:");
       int number=input.nextInt();
	   //initialising variables
	   int sumWithoutFormula=0;
	   int sumUsingFormula=0;
	   //if statement to check natural number and loop to calculate sum of natural number 
	   if(number>0)
	   {
	       sumUsingFormula=number*(number+1)/2;
	       int i=1;
	       while(i<=number)
		   {
		       sumWithoutFormula+=i;
			   i++;
			}
		}
		//compare
		if(sumUsingFormula==sumWithoutFormula)
		{
		    System.out.println("Both the result is same");
		}
			
        // display sum outside the loop
        System.out.println("Sum without formula = " + sumWithoutFormula+" Sum with formula= "+sumUsingFormula);
		//closing input
        input.close();
    }
}
