//Write a replace method in Java that replaces a given word with another word in a sentence:

//importing Scanner class
import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = input.next();

        System.out.println("Enter the new word:");
        String newWord = input.next();

        String result = replaceWord(sentence, oldWord, newWord);

        // Output
        System.out.println("Updated sentence:");
        System.out.println(result);
		// closing input
		input.close();
	}

	//check anagrams
	public static String replaceWord(String sentence,String oldWord, String newWord)
	{
		String[] word=sentence.split(" ");
		String result="";
		for(int i=0; i<word.length; i++)
		{
			if(word[i].equals(oldWord))
			{
				result+=newWord;
			}
			else
			{
				result+=word[i];
			}
			// add space except after last word
            if (i < word.length - 1) {
                result += " ";
            }
        }
		return result;	
		
	}
}

