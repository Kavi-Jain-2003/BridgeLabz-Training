//Write a program to find the sum of n natural numbers using for loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

//importing Scanner class for input
import java.util.Scanner;

public class SumOfNaturalNumbersUsingFor {
    public static void main(String[] args) {
		//creating scanner object
        Scanner input = new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number:");
       int number=input.nextInt();
	   int sumWithoutFormula=0;
	   int sumUsingFormula=0;
	   //sumUsingFormula and sumWithoutFormula
	   if(number>0)
	   {
		   System.out.println("you entered a natural number");
	       sumUsingFormula=number*(number+1)/2;
	       for(int i=1; i<=number; i++)
		   {
		       sumWithoutFormula+=i;
			}
			if(sumUsingFormula==sumWithoutFormula)
     		{
				System.out.println("Both the result is same");
			}
			// display sum outside the loop
			System.out.println("Sum without formula = " + sumWithoutFormula+" Sum with formula= "+sumUsingFormula);
		}
		else
		{
			System.out.println("you entered a non-natural number");
		}
		//closing input
		
        input.close();
    }
}
