//Write a Java program to remove all occurrences of a specific character from a string.

//importing Scanner class
import java.util.Scanner;

public class RemoveAllOccurrences {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		System.out.println("Enter a string:");
		String text = input.nextLine();

		System.out.println("Enter the character to remove:");
        char removeChar = input.next().charAt(0);

        String result = removeCharacter(text, removeChar);

        // Output
        System.out.println("Resulting string: " + result);
		// closing input
		input.close();
	}

	//remove character from string
	public static String removeCharacter(String text,char remove) {
		String afterRemoveChar="";
		for(int i=0; i<text.length(); i++)
		{
			char ch=text.charAt(i);
			if(ch!=remove)
			{
				afterRemoveChar+=ch;
			}
		}
		return afterRemoveChar;
	}
}
