//GCD and LCM Calculator: ○ Create a program that calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using functions.
//importing Scanner class
import java.util.Scanner;

public class GCDAndLCM {
	public static void main(String[] args) {
		// scanner object
	Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);

		// closing input
		input.close();
	}

	// Function to calculate GCD (Euclidean Algorithm)
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

