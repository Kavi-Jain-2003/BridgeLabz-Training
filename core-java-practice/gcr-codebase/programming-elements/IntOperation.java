//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 

//importing Scanner class
import java.util.Scanner;
public class IntOperation
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter a:");
	    int a=input.nextInt();
		System.out.println("Enter b:");
		int b=input.nextInt();
		System.out.println("Enter c:");
		int c=input.nextInt();
		//calculating according to the formulas
		int result1=a+b*c;
		int result2=a*b+c;
		int result3=c+c/b;
		int result4=a%b+c;
		//displaying output
		System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		//closing input
		input.close();
	}
}

