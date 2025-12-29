
//Palindrome Checker:Write a program that checks if a given string is a palindrome (a word, phrase, or sequence that reads the same backward as forward).
//importing Scanner class
import java.util.Scanner;

public class PalindromeChecker {
	// scanner object
	static Scanner input = new Scanner(System.in);
	static String text = "";

	public static void main(String[] args) {

		userInput();
		boolean isPalindrome = palindromeCheck(text);
		result(isPalindrome);
		// closing input
		input.close();
	}

	public static void userInput() {// user input
		System.out.println("enter a string:");
		text = input.nextLine().toLowerCase();
	}

	// palindrome check
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

	public static void result(boolean isPalindrome) {
		// check for palindrome
		if (isPalindrome) {
			System.out.println("String:" + text + " is palindrome");
		} else {
			System.out.println("String:" + text + " is not palindrome");
		}
	}
}
