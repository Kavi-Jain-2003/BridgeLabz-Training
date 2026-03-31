//Write a Java program to count the number of vowels and consonants in a given string.
//importing Scanner class
import java.util.Scanner;
public class CountVowelsAndConsonants
{
	public static void main(String[] args)
	{
		//scanner object
		Scanner input=new Scanner(System.in);
		//user input
		System.out.println("enter a string:");
		String text=input.nextLine().toLowerCase();
		int vowels=0;
		int consonants=0;
		//to find vowels and consonants
		for(int i=0; i<text.length(); i++)
		{
			char ch=text.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		//display result
		System.out.println("No. of vowels:"+vowels);
		System.out.println("No. of consonants:"+consonants);
		
		//closing input
		input.close();
	}
}