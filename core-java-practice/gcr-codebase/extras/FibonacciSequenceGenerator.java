//Fibonacci Sequence Generator:Write a program that generates the Fibonacci sequence up to a specified number of terms entered by the user.
//importing Scanner class
import java.util.Scanner;

public class FibonacciSequenceGenerator {
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number of terms for fibonacci series:");
	int term=input.nextInt();
	fibonacciGenerator(term);
		//close input
	input.close();
	}	
	public static void fibonacciGenerator(int term)
	{
		int a=0;
		int b=1; 
		System.out.print(a+" "+b+" ");
		
		for(int i=2; i<=term; i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
