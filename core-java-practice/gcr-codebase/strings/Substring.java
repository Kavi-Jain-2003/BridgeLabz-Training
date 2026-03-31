
//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//importing Scanner clas
import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		// taking input from user
		System.out.println("enter string to get extracted:");
		String s1 = input.next();
		System.out.println("enter start and end indexes");
		int start = input.nextInt();
		int end = input.nextInt();
		// substring using charAt()
		String subWithCharAt = substringWithCharAt(s1, start, end);

		// substring using built-in method
		String substringWithMethod = s1.substring(start, end);

		System.out.println("Substring of " + s1 + "from " + start + " to " + end + " using charAt is:" + subWithCharAt);
		System.out.println(
				"Substring of " + s1 + "from " + start + " to " + end + " using method is:" + substringWithMethod);
		// Compare both substrings
		if (subWithCharAt.equals(substringWithMethod)) {
			System.out.println("Both substrings are equal");
		} else {
			System.out.println("Both substrings are not equal");
		}
		// close input
		input.close();
	}

	public static String substringWithCharAt(String s1, int start, int end) {
		String result = "";
		for (int i = start; i < end; i++) {
			result += s1.charAt(i);
		}
		return result;
	}
}