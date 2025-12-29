//Prime Number Checker:Create a program that checks whether a given number is a prime number.
//importing Scanner class
import java.util.Scanner;

public class PrimeNumberChecker {
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=input.nextInt();
	boolean isPrime=primeCheck(number);
	result(number,isPrime);
	//close input
	input.close();
	}
	public static boolean primeCheck(int number)
	{
		for(int i=2; i<number/2; i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void result(int number,boolean isPrime)
	{
		if(isPrime)
		{
			System.out.println(number+" is prime no.");
		}
		else
		{
			System.out.println(number+" is not a prime no.");
		}
	}
			
}