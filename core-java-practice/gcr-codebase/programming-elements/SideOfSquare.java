//Write a program to find the side of the square whose perimeter you read from the user

import java.util.Scanner;
public class SideOfSquare
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    double perimeter=input.nextDouble();
		double lengthOfSide=perimeter/4;
		System.out.println("The length of the side is "+lengthOfSide+" whose perimeter is "+perimeter);
		input.close();
	}
}
