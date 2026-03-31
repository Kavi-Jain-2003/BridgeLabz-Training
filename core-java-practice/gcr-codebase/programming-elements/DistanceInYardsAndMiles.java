//Write a program to find the distance in yards and miles for the distance provided by the user in feet

//importing Scanner class
import java.util.Scanner;
public class DistanceInYardsAndMiles
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter distance in feets:");
	    int distanceInFeet=input.nextInt();
		//calculating distance in yards and miles
		double distanceInYards=distanceInFeet/3;
		double distanceInMiles=distanceInYards/1760;
		//displaying output
		System.out.printf("The distance in yards is %.0f\n",distanceInYards);
		System.out.printf("distance in miles is %.0f\n" ,distanceInMiles);
		//closing input
		input.close();
	}
}

