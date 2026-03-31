
//Write a Java program to check if a given string is a palindrome (a string that reads the same forward and backward).
//importing Scanner class
import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine().toLowerCase();
		boolean isPalindrome = palindromeCheck(text);
		//check for palindrome
		if (isPalindrome) {
			System.out.println("String:" + text + " is palindrome");
		} else {
			System.out.println("String:" + text + " is not palindrome");
		}
		// closing input
		input.close();
	}
	//palindrome check
	public static boolean palindromeCheck(String text) {
		int start = 0;
		int end = text.length() - 1;
		while (start <= end) {
			if (text.charAt(start) != text.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
			return true;	
	}
}
		
	