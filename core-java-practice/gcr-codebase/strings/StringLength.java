//Write a program to find and return the length of a string without using the length() method 
//importing scanner class
import java.util.Scanner;

public class StringLength
{
	public static void main(String[] args)
	{
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		//user input
		System.out.println("enter a string:");
		String text=input.next();
		//length with builtin or without builtin method
		int lengthWithoutMethod=countStringLength(text);
		int lengthWithMethod=text.length();
		System.out.println("length of string without method:"+lengthWithoutMethod);
		System.out.println("length of string without method:"+lengthWithMethod);
		//closing input
		input.close();
	}
	//method to count length of string without method
	public static int countStringLength(String s)
	{
		int count=0;
		int i=0;
		while(true)
		{	try
			{
				s.charAt(i);
				count++;
				i++;
			}
			catch(Exception ex)
			{
				return count;
			}
		}
	}
}	
