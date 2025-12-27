//Write a Java program to count how many times a given substring occurs in a string.
//importing Scanner class
import java.util.Scanner;

public class SubstringOccurrence {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine().toLowerCase();
		System.out.println("enter a substring to search:");
		String sub = input.nextLine().toLowerCase();
		int count=countOccurrences(text,sub);
		// output
		System.out.println("Substring:"+sub+"occurs:"+count+" times");

		// closing input
		input.close();
	}

	// count occurrence of substring
	public static int countOccurrences(String text,String sub) {
		int index=0; 
		int count=0;
		while(true)
		{
			index=text.indexOf(sub,index);
			if(index==-1)
			{
				break;
			}
			count++;
			index=index+sub.length();
		}
		return count;
	}
}
