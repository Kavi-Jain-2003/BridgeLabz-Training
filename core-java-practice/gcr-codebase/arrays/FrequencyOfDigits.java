//Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

//importing Scanner class for input
import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // Take number of students
        System.out.print("Enter number: ");
        long number = input.nextLong();

        long temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            int lastDigit = (int) (temp % 10);

            digits[index] = lastDigit;

            index++;
            temp = temp / 10;
        }

        // Frequency array (0–9)
        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < count; i++) {
            int digit = digits[i];

            frequency[digit]++;
        }

        // Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // closing input
        input.close();

    }
}