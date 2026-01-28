import java.util.Scanner;

public class FlipKeyLogical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String word = sc.nextLine().trim();

		String resultStr = CleanseAndInvert(word);
		if (!(resultStr.isEmpty())) {
			System.out.println("the generated key is:" + resultStr);
		} else {

			System.out.println("Invalid Input");
		}

	}

	public static String CleanseAndInvert(String word) {

		// check whether word is not empty and has length greater than 6
		if (word == null || word.length() < 6) {
			return "";
		}
		// word doesnot have digits,symbols or special characters
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
				return "";
			}
		}
		String lowerWord = convertingToLowerCase(word);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lowerWord.length(); i++) {
			char ch = lowerWord.charAt(i);
			int asciivalue = (int) ch;
			// storing those characters having ascii value odd
			if (asciivalue % 2 != 0) {
				sb.append(ch);
			}
		}
		StringBuilder reversedStr = reverseStr(sb);
		String evenPositionedReversedStr = convertingToUpperCase(reversedStr.toString());
		// to reverse the remaining characters
		return evenPositionedReversedStr.toString();

	}

	// converting to lowercase
	public static String convertingToLowerCase(String str) {
		String lowerStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				lowerStr += ((char) (ch + 32));
			} else {
				lowerStr += ch;
			}
		}
		return lowerStr;
	}

	// converting to uppercase
	public static String convertingToUpperCase(String str) {
		String upperStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i % 2 == 0) {				
				if (ch >= 'a' && ch <= 'z') {
					upperStr += ((char) (ch - 32));
				}
			}
			 else {
					upperStr += ch;
				}
		}
		return upperStr;
	}

	// reversing the character
	public static StringBuilder reverseStr(StringBuilder sb) {
		StringBuilder reversed = new StringBuilder();
		for (int i = sb.length() - 1; i >= 0; i--) {
			char ch = sb.charAt(i);
			reversed.append(ch);
		}
		return reversed;
	}

}