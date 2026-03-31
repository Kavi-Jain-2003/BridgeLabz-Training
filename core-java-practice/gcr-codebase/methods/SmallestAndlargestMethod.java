//Write a program to find the smallest and the largest of the 3 numbers.

//importing Scanner class
import java.util.Scanner;

public class SmallestAndlargestMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter three no.s:");
        int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		//output
		int[] result = findSmallestAndLargest(a, b, c);
		System.out.println("Smallest: " + result[0]);
		System.out.println("Largest: " + result[1]);
        
		// closing input
		input.close();
	}

	//smallest and largest number
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{
		int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

         return new int[] { smallest, largest };
	}
}