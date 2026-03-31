//Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array

//importing scanner class
import java.util.Scanner;

public class EvenAndOddArray {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("enter a number:");
			int number = input.nextInt();
			if (number <= 0) {
				System.out.println("error:you entered a non natural no.:");
				break;
			} 
				// creating array
				int[] evenArray = new int[number / 2 + 1];
				int[] oddArray = new int[number / 2 + 1];
				int evenIndex = 0;
				int oddIndex = 0;
				// inserting elements to array
				for (int i = 1; i <= number; i++) {
					if (i % 2 == 0) {
						evenArray[evenIndex] = i;
						evenIndex++;
					} else {
						oddArray[oddIndex] = i;
						oddIndex++;
					}
				}
				System.out.println("even array:");
				for (int i = 0; i < evenIndex; i++) {
					System.out.println(evenArray[i]);
				}
				System.out.println("odd array:");
				for (int i = 0; i < oddIndex; i++) {
					System.out.println(oddArray[i]);
				}
			
		}
		// closing input
		input.close();
	}
}
