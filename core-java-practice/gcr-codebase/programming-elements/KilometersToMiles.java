//Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula:
//importing scanner class
import java.util.Scanner;
public class KilometersToMiles
{
    public static void main(String[] args)
	{
		//creating scnner object
	    Scanner input=new Scanner(System.in);
		//taking inputs from user
		double kilometers=input.nextDouble();
		//calculating kilo to miles
        double miles=kilometers*0.621371;					
		
		//display result
		System.out.println("kilometers:"+kilometers+" to miles is:"+miles);
		//closing input
		input.close();
	}
}
	