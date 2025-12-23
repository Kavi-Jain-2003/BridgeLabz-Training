//Write a program that takes two numbers as input from the user and prints their sum.

//importing Scanner class
import java.util.Scanner;
public class AddTwoNumbers
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter num1 and num2");
		int num1=input.nextInt();
		int num2=input.nextInt();
		//calculating addition
		int add=num1+num2;
		//displaying output
		System.out.println("Sum:"+add);
		//closing input
		input.close();
	}
}
	