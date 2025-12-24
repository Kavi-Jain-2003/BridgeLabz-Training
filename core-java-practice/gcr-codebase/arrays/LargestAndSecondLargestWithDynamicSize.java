//Create a program to store the digits of the number in an array and find the largest and second largest element of the array.

//importing scanner class
import java.util.Scanner;

public class LargestAndSecondLargestWithDynamicSize {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter a bigno.:");
		long number = input.nextLong();
		int maxDigit = 10;
		int index = 0;
		int largest = 0;
		int secondLargest = 0;
		// creating array
		int[] digits = new int[maxDigit];
		//getting lastdigit one by one and adding them into array
		while (number != 0) {
			if (index == maxDigit) {
				maxDigit=maxDigit+10;
				int[] temp=new int[maxDigit];
				
				//copy old data
				for(int i=0; i<digits.length; i++)
				{
				temp[i]=digits[i];
				}
				//assign back
				digits=temp;
			}
			int digit = (int)(number % 10);
			digits[index] = digit;
			number = number / 10;
			index++;
		}
		// Find largest and second largest
		for (int i = 0; i < index; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}

		// output
		System.out.println("largest:" + largest);
		System.out.println("secondlargest:" + secondLargest);

		// closing input
		input.close();
	}
}
