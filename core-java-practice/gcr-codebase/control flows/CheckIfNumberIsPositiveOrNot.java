//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class CheckIfNumberIsPositiveOrNot
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int number=input.nextInt();
		if(number>0)
		{
			System.out.println("The number "+number+" is positive");
		}
		else if(number<0)
		{
		    System.out.println("The number "+number+" is negative");
		}
		else
		{
			System.out.println("The number "+number+" is zero");			
		}		
		input.close();
	}
}