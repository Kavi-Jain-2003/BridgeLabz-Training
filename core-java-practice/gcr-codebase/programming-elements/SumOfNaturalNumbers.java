//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 

//importing Scanner class for input
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int number=input.nextInt();
	   int sumWithoutFormula=0;
	   int sumUsingFormula=0;
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
		if(sumUsingFormula==sumWithoutFormula)
		{
		    System.out.println("Both the result is same");
		}
			
        // display sum outside the loop
        System.out.println("Sum without formula = " + sumWithoutFormula+" Sum with formula= "+sumUsingFormula);
        input.close();
    }
}
