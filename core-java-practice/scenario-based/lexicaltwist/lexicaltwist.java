import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;

public class lexicaltwist {
	static Set<Character> vowelsSet=new LinkedHashSet<>();
	static Set<Character> consonantsSet=new LinkedHashSet<>();
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("enter the first word:");
			String first = br.readLine();
			System.out.println("enter the second word:");
			String second = br.readLine();
			// to check if both the strings have single word 
			if((!first.trim().contains(" "))&&( !second.trim().contains(" ")))
			{
				reverseVersion(first, second);
			}
			else
			{
				System.out.println("invalid strings for this game");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reverseVersion(String first, String second) {
		
		// lowercasing the first
		String firstLowered = tolowerstr(first);
		// reversing the first word
		String firstRev = reverseString(firstLowered);

		// comparing whether second is the reversed version of the first one
		if (second.equals(firstRev)) {
			System.out.println("second is the reversed version of the first");
			
			//replacing vowels with @
			String transformedStr = replaceVowels(second);
			System.out.println(transformedStr);
		}
		else {
			System.out.println("second is not the reversed version of the first");
			//combining first and second
			String combinedWord = first + second;
			
			//converting combined to upper
			String combinedUpper = toupperstr(combinedWord);
		
			int[] vowelsAndConsonants = countVowelsAndConsonants(combinedUpper);
			ArrayList<Character> vowelsList=new ArrayList<>(vowelsSet);
			ArrayList<Character> consonantsList=new ArrayList<>(consonantsSet);
			
			
			//if vowels is greater than consonants
			if (vowelsAndConsonants[0] > vowelsAndConsonants[1]) {
				if(vowelsList.size()>=2)
				{
				//get first 2 unique vowels
					System.out.print(vowelsList.get(0));
					System.out.print(vowelsList.get(1));
					
				}
			}
			else if (vowelsAndConsonants[0] < vowelsAndConsonants[1]) {
				if(consonantsList.size()>=2)
				{
					//get first 2 unique consonants
					System.out.print(consonantsList.get(0));
					System.out.print(consonantsList.get(1));			
				}

			} 
			else {
				System.out.println("the combined word:" + combinedUpper + " has equal Vowels and consonants");
			}

		}

	}
//reversing the string
	public static String reverseString(String str) {
		int len = str.length();
		String revStr = "";
		for (int i = len - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
//converting to lowercase
	public static String tolowerstr(String str) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') {
				result.append((char) (c + 32));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
//converting to uppercase
	public static String toupperstr(String str) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				result.append((char) (c - 32));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	}
//replacing vowels with @
	public static String replaceVowels(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				newStr += '@';
			} else {
				newStr += ch;
			}
		}
		return newStr;
	}
//counting vowels and consonants
	public static int[] countVowelsAndConsonants(String str)
	{
		
		int len=str.length();
		int vowels=0;		
		int consonants=0;
		for(int i=0; i<len; i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowels++;
				vowelsSet.add(ch);
			}
			//counts only consonants no junk characters
			else if(ch>='A'&&ch<='Z')
			{
				consonants++;
				consonantsSet.add(ch);
			}
		}
		return new int[]{vowels,consonants};
	}

}
