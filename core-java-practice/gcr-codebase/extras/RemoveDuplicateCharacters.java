
//Write a Java program to remove all duplicate characters from a given string and return the modified string.
//importing Scanner class
import java.util.Scanner;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine().toLowerCase();
		String result = removeDuplicates(text);
		// output
		System.out.println("String after removing duplicates:" + result);

		// closing input
		input.close();
	}

	// Remove duplicate characters
	public static String removeDuplicates(String text) {
		String unique = "";

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			boolean found = false;
			for (int j = 0; j < unique.length(); j++) {
				if (unique.charAt(j) == ch) {
					found = true;
					break;
				}
			}
			if (!found) {
				unique += ch;
			}
		}
		return unique;
	}
}
