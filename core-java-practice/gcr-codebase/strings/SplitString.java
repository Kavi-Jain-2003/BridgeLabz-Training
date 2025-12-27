//Write a program to split the text into words, compare the result with the split() method and display the result 

//importing scanner class
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		int lengthWithoutMethod = countStringLength(text);
		String[] splitStringWithMethodArray = text.trim().split("\\s+");

		String[] splitWithoutMethod = splitStringWithoutMethod(text, lengthWithoutMethod);

		boolean compareSplittedStrings = compareSplittedStrings(splitStringWithMethodArray, splitWithoutMethod);
		if (compareSplittedStrings) {
			System.out.println("both splitted strings are equal");
		} else {
			System.out.println("both splitted strings are not equal");
		}
		// closing input
		input.close();
	}

	// method to count length of string without method
	public static int countStringLength(String s) {
		int count = 0;
		int i = 0;
		while (true) {
			try {
				s.charAt(i);
				count++;
				i++;
			} catch (Exception ex) {
				return count;
			}
		}
	}

	// method to split the string without method
	public static String[] splitStringWithoutMethod(String s, int length) {
		int wordCount = 0;
		boolean inWord = false;
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (ch != ' ' && !inWord) {
				wordCount++;
				inWord = true;
			} else {
				inWord = false;
			}
		}
		String[] words = new String[wordCount];
		int index = 0;
		int start = -1;
		
		for (int i = 0; i <= length; i++) {
			if (i < length && s.charAt(i) != ' ') {
				if (start == -1) {
					start = i;
				}
			} else {
				if (start != -1) {
					words[index++] = s.substring(start, i);
					start = -1;
				}
			}
		}

		return words;

	}
	//comparing splitted strings
	public static boolean compareSplittedStrings(String[] a, String[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

}
