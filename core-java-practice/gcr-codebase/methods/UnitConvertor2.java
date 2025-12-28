//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. Please define static methods for all the UnitConvertor class methods.
//importing Scanner class
import java.util.Scanner;
public class UnitConvertor2 {
	public static void main(String[] args) {
        //scanner object
        Scanner input=new Scanner(System.in);
        // User inputs
        System.out.println("Enter value in yards:");
        double yards = input.nextDouble();

        System.out.println("Enter value in feet:");
        double feet = input.nextDouble();

        System.out.println("Enter value in meters:");
        double meters = input.nextDouble();

        System.out.println("Enter value in inches:");
        double inches = input.nextDouble();

        // Method calls and outputs
        System.out.println("\nYards to Feet: " +
                convertYardsToFeet(yards));

        System.out.println("Feet to Yards: " +
                convertFeetToYards(feet));

        System.out.println("Meters to Inches: " +
                convertMetersToInches(meters));

        System.out.println("Inches to Meters: " +
                convertInchesToMeters(inches));

        System.out.println("Inches to Centimeters: " +
                convertInchesToCentimeters(inches));

        input.close();
    }

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}

