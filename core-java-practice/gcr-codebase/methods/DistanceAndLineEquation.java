//Write a program for Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()

//importing scanner class
import java.util.Scanner;

public class DistanceAndLineEquation {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean distance between the points: %.2f\n", distance);

        // Calculate line equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", line[0], line[1]);

        
		//closing input
		input.close();
	}
// Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate slope and y-intercept of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // m = (y2 - y1)/(x2 - x1)
        double yIntercept = y1 - slope * x1;  // b = y1 - m*x1
        return new double[]{slope, yIntercept};
    }

}