// Write a program to take 2 numbers and print their quotient and remainder

//importing Scanner class
import java.util.Scanner;
public class DivisionResult
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter num1");
	    int number1=input.nextInt();
		System.out.println("Enter num2");
		int number2=input.nextInt();
		//calculating quotient and remainder
		double quotient=number1/number2;
		int remainder=number1%number2;
		//displaying output
		System.out.println("The Quotient is "+quotient+" and the Remainder is "+remainder+" of two number "+number1+" and "+number2);		
		//closing input
		input.close();
	}
}

