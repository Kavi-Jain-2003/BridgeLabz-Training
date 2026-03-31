//Write a program to calculate various trigonometric functions using Math class given an angle in degrees

//importing Scanner class
import java.util.Scanner;

public class TrignometricCalculator {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
       // User input
        System.out.println("Enter angle in degrees:");
        double angle = input.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine value: " + result[0]);
        System.out.println("Cosine value: " + result[1]);
        System.out.println("Tangent value: " + result[2]);
		// closing input
		input.close();
	}

	// Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[] { sinValue, cosValue, tanValue };
    }
}