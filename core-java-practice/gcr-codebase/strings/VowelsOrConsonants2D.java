//Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter

//importing scanner class
import java.util.Scanner;

public class VowelsOrConsonants2D {
	public static void main(String[] args) {
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("enter a string:");
		String text = input.nextLine();
		String lowerCaseText = lowerCaseString(text);
		String[][] result= findVowelsAndConsonants(lowerCaseText);
		// Display result
		displayResult(result);
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
	//finding vowel and consonant
	public static String[][] findVowelsAndConsonants(String text)
	{
		String[][] result=new String[text.length()][2];
		for(int i=0; i<text.length(); i++)
		{
			char ch=text.charAt(i);
			result[i][0]=String.valueOf(ch);
			result[i][1]=checkVowelOrConsonant(ch);
		}
		return result;
	}
	//method to display result
	public static void displayResult(String[][] data)
	{
		int countVowels=0;
		int countConsonants=0;
		for(int i=0; i<data.length; i++)
		{
			System.out.println(data[i][0]+"\t\t"+data[i][1]);
			if(data[i][1].equals("Vowel"))
			{
				countVowels++;
			}
			else if(data[i][1].equals("Consonant"))
			{
				countConsonants++;
			}
		}
		//printing count of vowel and consonant
		System.out.println("total vowels:"+countVowels);
		System.out.println("total consonants:"+countConsonants);
	}
		
}
