//Write a program to demonstrate ArrayIndexOutOfBoundsException. 

//importing Scanner class
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		
		
		handleArrayIndexOutOfBoundsException(text);
		// closing input
		input.close();
	}

	// Method to generate ArrayIndexOutOfBoundsException
	public static void generateArrayIndexOutOfBoundsException(String text) {
		char[] arr=text.toCharArray();
		System.out.println(arr[arr.length]);
	}

	// Method to handle ArrayIndexOutOfBoundsException
	public static void handleArrayIndexOutOfBoundsException(String text) {
		try {
			generateArrayIndexOutOfBoundsException(text);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException handled");
		}
	}
}