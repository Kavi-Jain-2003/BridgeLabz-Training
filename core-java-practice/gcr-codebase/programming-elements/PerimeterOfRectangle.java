//Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula:
//importing scanner class
import java.util.Scanner;
public class PerimeterOfRectangle
{
    public static void main(String[] args)
	{
		//creating scnner object
	    Scanner input=new Scanner(System.in);
		//taking inputs from user
		int length=input.nextInt();
		int width=input.nextInt();		
		
		//calculating perimeter
        int perimeter=2*(length+width);
		//display result
		System.out.println("Perimeter of rectangle is:"+perimeter);
		//closing input
		input.close();
	}
}
	