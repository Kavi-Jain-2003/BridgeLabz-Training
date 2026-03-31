//Write a program to demonstrate NumberFormatException. 

//importing Scanner class
import java.util.Scanner;

public class NumberFormatExceptionProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		
		handleNumberFormatException(text);
		// closing input
		input.close();
	}

	// Method to generate NumberFormatException
	public static void generateNumberFormatException(String text) {
		
		System.out.println(Integer.parseInt(text));
	}

	// Method to handle NumberFormatException
	public static void handleNumberFormatException(String text) {
		try {
			generateNumberFormatException(text);
		} catch (NumberFormatException ex) {
			System.out.println("NumberFormatException handled");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException handled");
		}
	}
}