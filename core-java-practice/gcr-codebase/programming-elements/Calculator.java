//Write a program to create a basic calculator that can perform addition, subtraction,multiplication, and division.
//The program should ask for two numbers(floating point) and perform all the operations
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);	
	    float num1=input.nextFloat();
		float num2=input.nextFloat();
		float addition=num1+num2;
		float subtraction=num1-num2;
		float multiplication=num1*num2;
		float division=num1/num2;
		System.out.println("The Addition, Subtraction, Multiplication and division value of 2 numbers "
		    +num1+" and "+num2+" is "+addition+","+subtraction+","+multiplication+","+division);
			input.close();
	}
}