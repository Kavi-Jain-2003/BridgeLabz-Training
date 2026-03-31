//Create a program to convert distanve in kilometers to miles

//importing Scanner class
import java.util.Scanner;
public class DistanceiInKiloMetersToMiles
{
    public static void main(String[] args)
	{
    //declaring variables
	double km;
	double mile;
	//creating scanner object
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Distance in km:");
	km=input.nextDouble();
	//1 mile is 1.6km
	mile=km/1.6;
	//displaying output
	System.out.println("The total miles is "+mile+" for the given "+km);  
	//closing input
	input.close();
	}
}