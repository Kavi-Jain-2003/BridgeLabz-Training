//Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string

//importing scanner class
import java.util.Scanner;

public class VowelsOrConsonants {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		String lowerCaseText = lowerCaseString(text);
		int[] counts = countVowelsAndConsonants(lowerCaseText);
		// Display result
		System.out.println("String: " + text);
		System.out.println("Vowels count: " + counts[0]);
		System.out.println("Consonants count: " + counts[1]);
		// closing input
		input.close();
	}
	//converting to lowercase 
	public static String lowerCaseString(String text) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				result += (char) (ch + 32);
			} else {
				result += ch;
			}
		}
		return result;
	}
	//check for vowel and consonant
	public static String checkVowelOrConsonant(char ch)
		{	
				if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
	}
	//counting vowels and consonants
	public static int[] countVowelsAndConsonants(String s)
		{ 
			int countConsonants=0;
			int countVowels=0;
			for(int i=0; i<s.length(); i++)
			{
				String result=checkVowelOrConsonant(s.charAt(i));
				if(result.equals("Vowel"))
				{
					countVowels++;
				}
				else if(result.equals("Consonant"))				
				{
					countConsonants++;
				}
			}
			return new int[]{countVowels,countConsonants};				
		}
}
