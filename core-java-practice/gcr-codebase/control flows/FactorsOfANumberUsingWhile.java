//Create a program to find the factors of a number taken as user input using while.


//importing Scanner class for input
import java.util.Scanner;

public class FactorsOfANumberUsingWhile {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		//if statemnt to check positive no. and while loop to find factor
		if(number>=0)
	   {
		   System.out.println("you entered a positive number");
		   int counter=1;
		   while(counter<number)	       
		   {
		       if(number%counter==0)
			   {
			       System.out.println("factor of "+number+" is "+counter);
			   }
			   counter++;
		   }			
		}
		else
		{
			System.out.println("you entered a non-positive number");
		}
		
        input.close();
    }
}