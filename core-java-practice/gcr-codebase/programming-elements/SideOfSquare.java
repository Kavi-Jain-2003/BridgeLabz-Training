//Write a program to find the side of the square whose perimeter you read from the user

//importing Scanner class
import java.util.Scanner;
public class SideOfSquare
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter perimeter:");
	    double perimeter=input.nextDouble();
		//calculating side of square
		double lengthOfSide=perimeter/4;
		//displaying output
		System.out.println("The length of the side is "+lengthOfSide+" whose perimeter is "+perimeter);
		//closing input
		input.close();
	}
}
