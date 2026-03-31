////Write a Java program to compare two strings lexicographically (dictionary order) without using built-in compare methods.

//importing Scanner class
import java.util.Scanner;

public class MostFrequentCharaceter {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		System.out.println("Enter a string:");
		String text = input.nextLine();

		char mostFrequent = findMostFrequentChar(text);

		System.out.println("Most frequent character: " + mostFrequent);
		// closing input
		input.close();
	}

	// find most findMostFrequentChar
	public static char findMostFrequentChar(String text) {
		int[] freq = new int[256];
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			freq[ch]++;
		}

		int maxCount = 0;
		char result = text.charAt(0);
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (freq[ch] > maxCount) {
				maxCount = freq[ch];
				result = ch;
			}
		}
		return result;
	}
}
