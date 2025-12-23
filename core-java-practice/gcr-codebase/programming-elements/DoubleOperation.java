//Write an DoubleOperation program by taking double values and doing the same operations

//importing Scanner class
import java.util.Scanner;
public class DoubleOperation
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter a:");
	    double a=input.nextDouble();
		System.out.println("Enter b:");
		double b=input.nextDouble();
		System.out.println("Enter c:");
		double c=input.nextDouble();
		//calculating according to the formulas
		double result1=a+b*c;
		double result2=a*b+c;
		double result3=c+c/b;
		double result4=a%b+c;
		//displaying output
		System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		//closing input
		input.close();
	}
}

