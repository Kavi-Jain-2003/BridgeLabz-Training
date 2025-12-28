//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

//importing scanner class
import java.util.Scanner;

public class NumberCheckerMethod {
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

        // Duck number check
        if (isDuckNumber(digits)) {
            System.out.println("It is a Duck Number");
        } else {
            System.out.println("It is NOT a Duck Number");
        }

        // Armstrong number check
        if (isArmstrongNumber(digits, digitCount, number)) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is NOT an Armstrong Number");
        }

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);

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
	//method to check for duck number
	public static boolean isDuckNumber(int[] digits)
	{
		for(int digit:digits)
		{
			if(digit==0)
			{
				return true;
			}
		}
		return false;
	}
	
    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int[] digits, int count, int original) {
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        return sum == original;
    }
	// Method to find largest and second largest
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
    }
	// Method to find smallest and second smallest
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + secondSmallest);
    }


	
}