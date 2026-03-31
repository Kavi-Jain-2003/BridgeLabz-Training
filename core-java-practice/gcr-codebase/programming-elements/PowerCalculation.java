//Write a program that takes two numbers as input: a base and an exponent, and prints the result of base raised to the exponent (without using loops or conditionals).
//importing scanner class
import java.util.Scanner;
public class PowerCalculation
{
    public static void main(String[] args)
	{
		//creating scnner object
	    Scanner input=new Scanner(System.in);
		//taking inputs from user
		int base=input.nextInt();		
		int exponent=input.nextInt();
		
		//calculating power raised to the exponent
        double power=Math.pow(base,exponent);
		//display result
		System.out.println("Base:"+base+" raised to the exponent "+exponent+" is:"+power);
		//closing input
		input.close();
	}
}
	