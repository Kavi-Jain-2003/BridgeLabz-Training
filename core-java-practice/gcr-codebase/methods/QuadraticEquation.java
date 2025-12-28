//Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()

//importing Scanner class
import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Calling method to find roots
        double[] roots = findRoots(a, b, c);

        // Display result
        if (roots.length == 2) {
            System.out.println("Two Roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("One Root:");
            System.out.println("Root = " + roots[0]);
        } 
        else {
            System.out.println("No real roots (Delta is negative)");
        }

		// closing input
		input.close();
	}

	 // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta > 0 → two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // If delta == 0 → one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta < 0 → no real roots
        else {
            return new double[]{}; // empty array
        }
    }
}