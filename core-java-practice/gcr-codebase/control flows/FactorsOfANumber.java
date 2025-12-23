//Create a program to find the factors of a number taken as user input.


//importing Scanner class for input
import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		//if statemnt to check positive no. and for loop to find factor
		if(number>=0)
	   {
		   System.out.println("you entered a positive number");
	       for(int i=1; i<number; i++)
		   {
		       if(number%i==0)
			   {
			       System.out.println("factor of "+number+" is "+i);
			   }
		   }			
		}
		else
		{
			System.out.println("you entered a non-positive number");
		}
		//closing input
        input.close();
    }
}