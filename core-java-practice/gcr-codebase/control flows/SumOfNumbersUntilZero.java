//Write a program to find the sum of numbers until the user enters 0


//importing Scanner class for input
import java.util.Scanner;

public class SumOfNumbersUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // total initialized to 0.0
        double total = 0.0;

        // variable to store user input
        double value;

        // take first input
		System.out.println("Enter value:");
        value = input.nextDouble();

        // while loop continues until user enters 0
        while (value != 0) {
            total += value;          // add value to total
            value = input.nextDouble(); // ask input again
        }

        // display total outside the loop
        System.out.println("Total = " + total);
		//closing input
        input.close();
    }
}
