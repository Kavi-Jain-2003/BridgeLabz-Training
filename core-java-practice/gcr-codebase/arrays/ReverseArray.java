//Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order

//importing scanner class
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// Take user input
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        long temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Create array to store digits
        int[] digits = new int[count];

        temp = number;
        int index = 0;

        // Store digits in array
        while (temp != 0) {
            digits[index] = (int)(temp % 10);
            temp = temp / 10;
            index++;
        }

        // Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
		// closing input
		input.close();
	}
}
