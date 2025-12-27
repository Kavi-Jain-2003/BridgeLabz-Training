//Write a program to find the first non-repeating character in a string and show the result

//importing scanner class
import java.util.Scanner;
public class NonRepeatingCharacter
{
	public static void main(String[] args)
	{
	//scanner object
	Scanner input=new Scanner(System.in);
	//user input
	System.out.println("enter a string:");
	String text=input.nextLine();
	char result=findFirstNonRepeatingCharacter(text);
	if(result!='\0')
	{
		System.out.println("first non-repeating character:"+result);
	}
	else
	{
		System.out.println("No non-repeating character");
	}
	//closing input
	input.close();
	}
	//method to find non-repeating characters
	public static char findFirstNonRepeatingCharacter(String text)
	{
		int[] frequency=new int[256];
		//count frequency of each character
		for(int i=0; i<text.length(); i++)
		{
			char ch=text.charAt(i);
			frequency[ch]++;
		}
		//finding first character having frequency as 1
		for(int i=0; i<text.length(); i++)
		{
			char ch=text.charAt(i);
			if(frequency[ch]==1)
			{
				return ch;
			}
		}
		return '\0';
	}
	
}


