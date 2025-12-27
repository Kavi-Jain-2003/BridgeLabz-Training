//Write a program to check if two texts are anagrams and display the result

//importing scanner class
import java.util.Scanner;
public class AnagramCheck
{
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	//user input
	System.out.println("enter first string:");
	String text1=input.nextLine();
	System.out.println("enter second string:");
	String text2=input.nextLine();
	boolean isAnagram=checkAnagram(text1,text2);
	if(isAnagram)
	{
		System.out.println("the texts are anagrams");
	}
	else
	{
		System.out.println("the texts are not anagrams");
	}
	
		//closing input
		input.close();
	}
	//method to check for anagrams
	public static boolean checkAnagram(String text1,String text2)
	{
		if(text1.length()!=text2.length())
		{
			return false;
		}
		int[] freq1=new int[256];
		int[] freq2=new int[256];
		for(int i=0; i<text1.length(); i++)
		{
			freq1[text1.charAt(i)]++;
			freq2[text2.charAt(i)]++;
		}
		for(int i=0; i<256; i++)
		{
			if(freq1[i]!=freq2[i])
			{
				return false;
			}
		}
		return true;
	}
	 
	
}




