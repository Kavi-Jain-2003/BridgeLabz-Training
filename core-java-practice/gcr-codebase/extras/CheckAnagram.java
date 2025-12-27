//Write a Java program that accepts two strings from the user and checks if the two strings are anagrams of each other (i.e., whether they contain the same characters in any order).

//importing Scanner class
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		
        System.out.println("Enter first string:");
        String str1 = input.nextLine().toLowerCase();

        System.out.println("Enter second string:");
        String str2 = input.nextLine().toLowerCase();

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
		// closing input
		input.close();
	}

	//check anagrams
	public static boolean areAnagrams(String s1, String s2)
	{
		//remove spaces
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		//if lengths are not equal,then they are not anagrams
		if(s1.length()!=s2.length())
		{
			return false;
		}
		int[] freq=new int[256];
		 // Count characters of first string
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			freq[ch]++;
		}
		 // Subtract characters of second string
		for(int i=0; i<s2.length(); i++)
		{
			char ch=s2.charAt(i);
			freq[ch]--;
		}
		// Check if all counts are zero
		for(int i=0; i<freq.length; i++)
		{
			if(freq[i]!=0)
			{
				return false;
			}
		}
		return true;		
	}
}

