//Write a program to calculate the area of a circle. Take the radius as input and use the formula:
import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
		int radius=input.nextInt();
        double pi=3.14;
        double area=pi*radius*radius;
		System.out.println("Area of circle with radius "+radius+" is:"+area);
		input.close();
	}
}
	