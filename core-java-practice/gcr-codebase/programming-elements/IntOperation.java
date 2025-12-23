//Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 

import java.util.Scanner;
public class IntOperation
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int result1=a+b*c;
		int result2=a*b+c;
		int result3=c+c/b;
		int result4=a%b+c;
		System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
		input.close();
	}
}

