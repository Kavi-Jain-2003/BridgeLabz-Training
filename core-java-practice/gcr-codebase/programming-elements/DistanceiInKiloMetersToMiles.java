//Create a program to convert distanve in kilometers to miles

import java.util.Scanner;
public class DistanceiInKiloMetersToMiles
{
    public static void main(String[] args)
	{
	double km;
	double mile;
	Scanner input=new Scanner(System.in);
	km=input.nextDouble();
	//1 mile is 1.6km
	mile=km/1.6;
	System.out.println("The total miles is "+mile+" for the given "+km);  
	input.close();
	}
}