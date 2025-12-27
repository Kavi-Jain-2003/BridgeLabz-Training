//Write a Java program to toggle the case of each character in a given string. Convert uppercase letters to lowercase and vice versa.

//importing Scanner class
import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		// output
		
		String toggledString=toggleUpperOrLower(text);
		System.out.println("toggled string:"+toggledString);

		// closing input
		input.close();
	}

	// count occurrence of substring
	public static String toggleUpperOrLower(String text) 
	{	
		String toggled="";
		 for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // lowercase to uppercase
            if (ch >= 'a' && ch <= 'z') {
                toggled += (char) (ch - 32);
            }
            // uppercase to lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                toggled += (char) (ch + 32);
            }
            // other characters
            else {
                toggled += ch;
            }
        }
        return toggled;
	}
}
