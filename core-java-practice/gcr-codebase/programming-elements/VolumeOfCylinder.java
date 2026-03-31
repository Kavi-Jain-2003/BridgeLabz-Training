//Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:
import java.util.Scanner;
public class VolumeOfCylinder
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
		int radius=input.nextInt();
		int height=input.nextInt();
        double pi=3.14;
        double volume=pi*radius*radius*height;
		System.out.println("Volume of cylinder with radius "+radius+" and height:"+height+" is:"+volume);
		input.close();
	}
}
	