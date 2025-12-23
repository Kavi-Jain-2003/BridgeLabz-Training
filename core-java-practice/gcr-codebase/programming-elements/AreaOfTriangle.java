//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters

//importing the scanner class to  take input
import java.util.Scanner;
public class AreaOfTriangle
{
    public static void main(String[] args)
	{
		//making scanner object
	    Scanner input=new Scanner(System.in);
		
		//taking inputs from user
	    int base=input.nextInt();
		int height=input.nextInt();
		
		//calculating area of triangle
		double area=(base*height)/2;
		
		//area of triangle in inches
		double areaInInches=area/2.54;
		
		//printing the result
		System.out.println("Area of triangle in inches "+area+" and area in inches"+areaInInches);
		
		//closing the scanner object
		input.close();
	}
}
