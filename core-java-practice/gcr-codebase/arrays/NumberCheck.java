//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
//importing scanner class
import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		// creating array
		int[] number = new int[5];
		// taking array elements from user
		System.out.println("Enter array of numbers:");
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		// loop to find positive and even odd no.
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				System.out.println(number[i] + " is a negative no.");
			} else if (number[i] > 0) {
				if (number[i] % 2 == 0) {
					System.out.println(number[i] + " is positive even no.");
				} else {
					System.out.println(number[i] + " is positive odd no.");
				}
			} else {
				System.out.println(number[i] + " is a zero");
			}
		}

			// to compare
			if (number[0] == number[number.length - 1]) {
				System.out.println(
						"first no.:" + number[0] + " and last no.:" + number[number.length - 1] + " are equal");
			} else if (number[0] > number[number.length - 1]) {
				System.out.println("first no.:" + number[0] + " is greater than last no.:" + number[number.length - 1]);
			} else {
				System.out.println("first no.:" + number[0] + " is smaller than last no.:" + number[number.length - 1]);
			}
		
		// closing input
		input.close();
	}
}
