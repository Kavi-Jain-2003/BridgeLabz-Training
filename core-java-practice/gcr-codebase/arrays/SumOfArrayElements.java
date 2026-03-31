//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 

//importing scanner class
import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter a array elements:");
		// creating array
		double[] array = new double[10];
		double total = 0.0;
		int index = 0;
		while (true) {
			if (index == 10) {
                break;
            }

            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

			array[index] = number;
			index++;
		}
		// display numbers and calculate sum
		System.out.println("Entered numbers:");
		for (int i = 0; i < index; i++) {
			System.out.println(array[i]);
			total += array[i];
		}

		// display total
		System.out.println("Sum of array values: " + total);

		// closing input
		input.close();
	}
}
