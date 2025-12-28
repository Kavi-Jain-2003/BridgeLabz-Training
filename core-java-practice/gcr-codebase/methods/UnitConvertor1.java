//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. Please define static methods for all the UnitConvertor class methods.

//importing Scanner class
import java.util.Scanner;
public class UnitConvertor1 {
	public static void main(String[] args) {
        //scanner object
        Scanner input=new Scanner(System.in);
        // User inputs
        System.out.println("Enter value in kilometers:");
        double km = input.nextDouble();

        System.out.println("Enter value in miles:");
        double miles = input.nextDouble();

        System.out.println("Enter value in meters:");
        double meters = input.nextDouble();

        System.out.println("Enter value in feet:");
        double feet = input.nextDouble();

        // Method calls and outputs
        System.out.println("\nKilometers to Miles: " +
                convertKmToMiles(km));

        System.out.println("Miles to Kilometers: " +
                convertMilesToKm(miles));

        System.out.println("Meters to Feet: " +
                convertMetersToFeet(meters));

        System.out.println("Feet to Meters: " +
                convertFeetToMeters(feet));

        input.close();
    }

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}

