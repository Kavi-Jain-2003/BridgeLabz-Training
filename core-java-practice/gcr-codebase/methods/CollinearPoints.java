//Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
//importing scanner class
import java.util.Scanner;

public class CollinearPoints {
	public static void main(String[] args) {
		// scanner object		
		Scanner input=new Scanner(System.in);

	// Sample input points
        System.out.println("Enter coordinates of 3 points:");

        System.out.print("x1: "); int x1 = input.nextInt();
        System.out.print("y1: "); int y1 = input.nextInt();
        System.out.print("x2: "); int x2 = input.nextInt();
        System.out.print("y2: "); int y2 = input.nextInt();
        System.out.print("x3: "); int x3 = input.nextInt();
        System.out.print("y3: "); int y3 = input.nextInt();

        // Check collinearity using slope
        if (checkCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (Slope method).");
        } else {
            System.out.println("The points are not collinear (Slope method).");
        }

        // Check collinearity using area
        if (checkCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear (Area method).");
        } else {
            System.out.println("The points are not collinear (Area method).");
        }

        
		//closing input
		input.close();
	}

	 // Method to check collinearity using slope formula
    public static boolean checkCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (double)(x2 - x1);
        double slopeBC = (y3 - y2) / (double)(x3 - x2);
        double slopeAC = (y3 - y1) / (double)(x3 - x1);

        // Points are collinear if slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

}