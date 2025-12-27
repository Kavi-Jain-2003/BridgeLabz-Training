//Write a program to check if two texts are anagrams and display the result

//importing scanner class
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		// logic 1
		boolean isPalindrome = palindromeCheck(text);
		// logic 2
		boolean isPalindromeRecursive = palindromeRecursiveCheck(text, 0, text.length() - 1);
		// logic 3
		char[] reverseArray = reverse(text);
		char[] originalArray = text.toCharArray();
		boolean isPalindromeArray = palindromeArrayCheck(originalArray, reverseArray);
		// using logic 1
		if (isPalindrome) {
			System.out.println("String:" + text + " is palindrome:");
		} else {
			System.out.println("String:" + text + " is not palindrome:");
		}
		// using logic 2
		if (isPalindromeRecursive) {
			System.out.println("String:" + text + " is palindrome:");
		} else {
			System.out.println("String:" + text + " is not palindrome:");
		}
		// using logic 3
		if (isPalindromeArray) {
			System.out.println("String:" + text + " is palindrome:");
		} else {
			System.out.println("String:" + text + " is not palindrome:");
		}

		// closing the input
		input.close();
	}

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

	// logic 2
	public static boolean palindromeRecursiveCheck(String text, int start, int end) {
		if (start >= end) {
			return true;
		}
		if (text.charAt(start) != text.charAt(end)) {
			return false;
		}
		return palindromeRecursiveCheck(text, start + 1, end - 1);

	}

	public static char[] reverse(String text) {
		char[] arr = new char[text.length()];
		int j = 0;
		for (int i = text.length() - 1; i >= 0; i--) {
			arr[j] = text.charAt(i);
			j++;
		}
		return arr;
	}

	// logic3
	public static boolean palindromeArrayCheck(char[] og, char[] rev) {

		for (int i = 0; i < og.length; i++) {
			if (og[i] != rev[i]) {
				return false;
			}
		}

		return true;
	}

}
