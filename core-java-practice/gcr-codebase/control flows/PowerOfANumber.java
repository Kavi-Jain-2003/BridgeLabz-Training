//Create a program to find the power of a number.

//importing Scanner class for input
import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number=input.nextInt();
		int power=input.nextInt();
		int result=1;
		//check input for positive integer and loop to calculate the power of that number
		if(number>=0)
		{
		    System.out.println("you entered a positive number ");
			for(int i=1; i<=power; i++)
			{
			    result=result*number;
			}
		}
		else
		{
		    System.out.println("invalid no.");
		}
		System.out.println(number+" to the "+power+" is "+result); 
		
		//closing the input
        input.close();
		
    }
}