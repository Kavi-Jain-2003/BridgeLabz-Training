//Write a program to find the distance in yards and miles for the distance provided by the user in feet

import java.util.Scanner;
public class DistanceInYardsAndMiles
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	    int distanceInFeet=input.nextInt();
		double distanceInYards=distanceInFeet/3;
		double distanceInMiles=distanceInYards/1760;
		System.out.printf("The distance in yards is %.0f\n",distanceInYards);
		System.out.printf("distance in miles is %.0f\n" ,distanceInMiles);
		input.close();
	}
}
