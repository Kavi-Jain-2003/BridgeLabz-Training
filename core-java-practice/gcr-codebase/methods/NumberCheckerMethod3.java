//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

//importing scanner class
import java.util.Scanner;

public class NumberCheckerMethod3 {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=input.nextInt();
		
		int digitCount=countDigits(number);
		int[] digits=storeDigits(number,digitCount);
		
		 System.out.print("Digits array: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int[] reversedDigits=reversedDigitsArray(digits);
		 System.out.print("Reversed digits array: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        System.out.println();
		// Palindrome check
        if (isPalindrome(digits, reversedDigits)) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is NOT a Palindrome");
        }

        // Duck number check
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number");
        } else {
            System.out.println("The number is NOT a Duck Number");
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
	//method to reverse digits array
	public static int[] reversedDigitsArray(int[] digits)
	{
		int[] reversed=new int[digits.length];
		int j=0;
		for(int i=digits.length-1; i>=0; i--)
		{
			reversed[j]=digits[i];
			j++;
		}
		return reversed;
	}
	// Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
	 // Method to check palindrome
    public static boolean isPalindrome(int[] digits, int[] reversedDigits) {
        return compareArrays(digits, reversedDigits);
    }
	// Method to check Duck Number    
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
		
}