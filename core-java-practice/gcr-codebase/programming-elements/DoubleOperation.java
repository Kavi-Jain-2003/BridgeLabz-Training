//Write an DoubleOperation program by taking double values and doing the same operations

import java.util.Scanner;
public class DoubleOperation
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double result1=a+b*c;
		double result2=a*b+c;
		double result3=c+c/b;
		double result4=a%b+c;
		System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		input.close();
	}
}

