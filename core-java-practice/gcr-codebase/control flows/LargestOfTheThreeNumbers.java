//Write a program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;
public class LargestOfTheThreeNumbers
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int number1=input.nextInt();
		int number2=input.nextInt();
		int number3=input.nextInt();
		boolean isFirstLargest=(number1>number2)&&(number1>number3);
		boolean isSecondLargest=(number2>number1)&&(number2>number3);
		boolean isThirdLargest=(number3>number2)&&(number3>number1);
		System.out.println("Is the first number the largest? "+isFirstLargest);
		System.out.println("Is the second number the largest? "+isSecondLargest);
		System.out.println("Is the third number the largest? "+isThirdLargest);
		input.close();
	}
}