//Write a program to check if the first, second, or third number is the largest of the three.

//importing Scanner class
import java.util.Scanner;
public class LargestOfTheThreeNumbers
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number1:");
	    int number1=input.nextInt();
		System.out.println("Enter number2:");
		int number2=input.nextInt();
		System.out.println("Enter number3:");
		int number3=input.nextInt();
		//finding largest
		boolean isFirstLargest=(number1>number2)&&(number1>number3);
		boolean isSecondLargest=(number2>number1)&&(number2>number3);
		boolean isThirdLargest=(number3>number2)&&(number3>number1);
		//displaying output
		System.out.println("Is the first number the largest? "+isFirstLargest);
		System.out.println("Is the second number the largest? "+isSecondLargest);
		System.out.println("Is the third number the largest? "+isThirdLargest);
		//closing input
		input.close();
	}
}