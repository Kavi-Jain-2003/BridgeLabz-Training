//Write a program FizzBuzz, take a number as user input, and check for a positive integer. If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz" using while.

//importing Scanner class for input
import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		System.out.println("Enter number:");
		int number=input.nextInt();
		//fizzbuzz for multiple of 3 and 5, fizz for multiple of 3 and buzz for multiple of 5
		if(number>=0)
		{
		    System.out.println("you entered a positive number");
			int i=1;
			while(i<=number)
			{
			    if(i%3==0 && i%5==0)
				{
				    System.out.println("FizzBuzz "+i);
				}
				else if(i%3==0)
				{
				    System.out.println("Fizz "+i);
				}
				else if(i%5==0)
				{
				    System.out.println("Buzz "+i);
				}
				i++;
			}
		}
		else
		{
		    System.out.println("you enetred a non positive number");
		}	
		//closing input
        input.close();
    }
}