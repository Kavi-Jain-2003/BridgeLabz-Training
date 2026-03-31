//Write a program to create a basic calculator that can perform addition, subtraction,multiplication, and division.
//The program should ask for two numbers(floating point) and perform all the operations

//importing Scanner class
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);	
		//taking input from user
		System.out.println("Enter num1:");
	    float num1=input.nextFloat();
		System.out.println("Enter num2:");
		float num2=input.nextFloat();
		//calculating add sub mul and division
		float addition=num1+num2;
		float subtraction=num1-num2;
		float multiplication=num1*num2;
		float division=num1/num2;
		//displaying output
		System.out.println("The Addition, Subtraction, Multiplication and division value of 2 numbers "
		    +num1+" and "+num2+" is "+addition+","+subtraction+","+multiplication+","+division);
			//closing input
			input.close();
	}
}