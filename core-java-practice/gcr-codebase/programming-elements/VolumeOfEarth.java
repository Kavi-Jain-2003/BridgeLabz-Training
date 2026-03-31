//Write a Program to compute the volume of Earth in km^3 and miles^3

public class VolumeOfEarth
{
    public static void main(String[] args)
	{
		//initialising variables
	    int radiusOfEarth=6378;
		double miles=1.6;
		double pi=3.14;
		//calculating volume in km and miles
		double VolumeOfEarthInKm=(4/3)*pi*radiusOfEarth*radiusOfEarth*radiusOfEarth;
		double VolumeOfEarthInMiles=VolumeOfEarthInKm/miles;
		//displaying output
		System.out.printf("The Volume of earth in cubickilometerrs is %.0f\n",VolumeOfEarthInKm);
		System.out.printf("The Volume of Earth in miles is %.0f\n",VolumeOfEarthInMiles);
	}
}