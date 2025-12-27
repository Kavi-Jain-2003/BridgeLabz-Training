//Write a program to demonstrate IllegalArgumentException. 

//importing Scanner class
import java.util.Scanner;

public class IllegalArgumentExceptionProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		
		handleIllegalArgumentException(text);
		// closing input
		input.close();
	}

	// Method to generate IllegalArgumentException
	public static void generateIllegalArgumentException(String text) {
		int start = text.length();
		int end = start - 2;
		System.out.println(text.substring(start, end));
	}

	// Method to handle IllegalArgumentException
	public static void handleIllegalArgumentException(String text) {
		try {
			generateIllegalArgumentException(text);
		} catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException handled");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException handled");
		}
	}
}