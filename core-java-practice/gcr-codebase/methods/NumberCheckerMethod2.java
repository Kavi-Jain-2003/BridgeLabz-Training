//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

//importing scanner class
import java.util.Scanner;

public class NumberCheckerMethod2 {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		int digitCount=countDigits(number);
		int[] digits=storeDigits(number,digitCount);
		System.out.println("count of digits:"+digitCount);
		System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        if (isHarshadNumber(number, sum)) {
            System.out.println("It is a Harshad Number");
        } else {
            System.out.println("It is NOT a Harshad Number");
        }

        int[][] frequency = digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " -> " + frequency[i][1]);
            }
        }
		//closing input
		input.close();
	}
	 // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
	//method to stor digits in array
	public static int[] storeDigits(int number,int count)
	{
		int[] digits=new int[count];
		int index=count-1;
		while(number!=0)
		{
			int digit=number%10;
			digits[index]=digit;
			number=number/10;
			index--;
		}
		return digits;
	}
	// Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
	
     // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
	// Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int sum) {
        return number % sum == 0;
    }

	// Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency 
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit][1]++;
        }

        return frequency;
    }	
}