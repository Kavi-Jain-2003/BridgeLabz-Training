
//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//importing Scanner clas
import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		// taking input from user
		System.out.println("enter two strings to compare:");
		String s1 = input.next();
		String s2 = input.next();
		Boolean compare = true;
		//compare strings without builtin method
		if (s1.length() != s2.length()) {
			compare = false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					compare = false;
					break;
				}
			}
		}
		//comparing both the strings
		if (compare) {
			System.out.println("string1:" + s1 + " string 2:" + s2 + " are equal?" + compare);
		} else {
			System.out.println("string1:" + s1 + " string 2:" + s2 + " are equal?" + compare);
		}
		//compare strings with builtin method
		boolean compareWithMethod = s1.equals(s2);
		if (compare) {
			System.out.println("string1:" + s1 + " string 2:" + s2 + " are equal?" + compareWithMethod);
		} else {
			System.out.println("string1:" + s1 + " string 2:" + s2 + " are equal?" + compareWithMethod);
		}
		//close input
		input.close();
	}
}
