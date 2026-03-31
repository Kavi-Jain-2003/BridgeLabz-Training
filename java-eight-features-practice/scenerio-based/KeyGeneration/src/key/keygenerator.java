package key;

import java.util.*;

public class keygenerator {
	public static String validate(String word) {
		// empty string
		if (word.isBlank()) {
			return "Invalid input(empty string)";
		}
		// length
		if (word.length() < 6) {
			return "Invalid input(length<6)";
		}
		// checks space
		if (word.matches(".*\\s+.*")) {
			return "Invalid input(contains space)";
		}
		// check digits
		if (word.matches(".*\\d.*")) {
			return "Invalid input(contains digits)";
		}
		// contains special characters
		if (word.matches(".*[^a-zA-Z].*")) {
			return "Invalid input(contains special character)";
		}

		return "true";
	}

	public static String operation(String word) {
		String filtered = "";
		word= word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!((int) (ch) % 2 == 0)) {
				filtered += ch;
			}
		}
			StringBuilder sb = new StringBuilder(filtered);
			String revWord = sb.reverse().toString();
			String finalResult="";
			for (int j = 0; j < revWord.length(); j++) {
				char ch2 = revWord.charAt(j);
				if (j % 2 == 0) {
					finalResult += Character.toUpperCase(ch2);
				} else {
					finalResult += ch2;
				}
			}
		return finalResult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			String word = input[i];
			String result = validate(word);
			if (!result.equals("true")) {
				System.out.println(result);
			} else {
				String finalresult = operation(word);
				System.out.println(finalresult);
			}
		}
		sc.close();
	}
}
