//Write a program to trim the leading and trailing spaces from a string using the charAt() method 

//importing scanner class
import java.util.Scanner;

public class StringTrim {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		int[] points = startAndEndPoint(text);
		int start = points[0];
		int end = points[1];
		String trimmedByCharAt = substringOfText(text, start, end);
		String trimmedWithMethod = text.trim();
		// compre
		boolean isBothEqual = compareBoth(trimmedByCharAt, trimmedWithMethod);
		if (isBothEqual) {
			System.out.println("both trimmed strings are equal");
		} else {
			System.out.println("both trimmed strings are not equal");
		}

		// closing the input
		input.close();
	}

	// finding start and end point after removing leading and trailing spaces
	public static int[] startAndEndPoint(String s) {
		int first = 0;
		int end = 0;
		// removing leading spaces
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				first = i;
				break;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				end = i;
				break;
			}
		}

		return new int[] { first, end };
	}

	public static String substringOfText(String text, int start, int end) {
		String result = "";
		for (int i = start; i <= end; i++) {
			result += text.charAt(i);
		}

		return result;
	}

	public static boolean compareBoth(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
