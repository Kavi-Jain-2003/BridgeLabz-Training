//Write a Program to check if the given number is a prime number or not

//importing Scanner class for input
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int number = input.nextInt();
		boolean isPrime=true;
		//if to check the number is greater than 1 and is not divisible by any other except itself and one
		if(number>1)
		{
		    for(int i=2; i<number; i++)
			{
			    if(number%2==0)
				{
				    isPrime=false;
				    break;
				}
			}
			if(isPrime)
		    {
		        System.out.println("The number "+number+" is a prime no.");
		    }
		    else
		    {
		        System.out.println("The number "+number+" is not a prime no.");
		    }
		}
		else
		{
			System.out.println("invalid no.");
		}
        //close the input
        input.close();
		
    }
}