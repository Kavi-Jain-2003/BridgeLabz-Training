// Write a program to take 2 numbers and print their quotient and remainder

import java.util.Scanner;
public class DivisionResult
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int number1=input.nextInt();
		int number2=input.nextInt();
		double quotient=number1/number2;
		int remainder=number1%number2;
		System.out.println("The Quotient is "+quotient+" and the Remainder is "+remainder+" of two number "+number1+" and "+number2);		
		input.close();
	}
}

