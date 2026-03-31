//Write a Java program that takes a sentence as input and returns the longest word in the sentence.
//importing Scanner class
import java.util.Scanner;

public class LongestWordInSentence {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine().toLowerCase();
		String longestWord = findLongestWord(text);
		// output
		System.out.println("Longest word in the sentence:"+longestWord);

		// closing input
		input.close();
	}

	//finding longest word
	public static String findLongestWord(String text) {
		String longestWord="";
		String[] wordArray=text.split(" ");
		for(int i=0; i<wordArray.length; i++)
		{
			if(wordArray[i].length()>longestWord.length())
			{
				longestWord=wordArray[i];
			}
		}
		return longestWord;
	}
}
