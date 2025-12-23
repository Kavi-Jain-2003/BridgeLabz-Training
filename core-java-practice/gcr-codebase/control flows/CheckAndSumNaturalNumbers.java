//Write a program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;
public class CheckAndSumNaturalNumbers
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int number=input.nextInt();
		if(number>=0)
		{
		    int naturalNumberSum=number*(number+1)/2;
			System.out.println("The sum of "+number+" natural number is "+naturalNumberSum);
		}
		else
		{
		    System.out.println("The number "+number+" is not a natural number");
		}		
		input.close();
	}
}