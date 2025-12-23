//Write a program to calculate the area of a circle. Take the radius as input and use the formula:

//importing Scanner class
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		int radius=input.nextInt();
		//initialising pi
        double pi=3.14;
		//calculating area
        double area=pi*radius*radius;
		//displaying output
		System.out.println("Area of circle with radius "+radius+" is:"+area);
		//closing input
		input.close();
	}
}
	