//Write a program that takes three numbers as input from the user and prints their average.
//importing scanner class
import java.util.Scanner;
public class AverageOfThreeNumbers
{
    public static void main(String[] args)
	{
		//creating scnner object
	    Scanner input=new Scanner(System.in);
		//taking inputs from user
		int num1=input.nextInt();		
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		//calculating power raised to the exponent
        double average=(num1+num2+num3)/3;
		//display result
		System.out.println("Average of "+num1+","+num2+","+num3+" is:"+average);
		//closing input
		input.close();
	}
}
	