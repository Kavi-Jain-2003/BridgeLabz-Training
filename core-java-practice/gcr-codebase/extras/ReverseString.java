//Write a Java program to reverse a given string without using any built-in reverse functions.
//importing Scanner class
import java.util.Scanner;
public class ReverseString
{
	public static void main(String[] args)
	{
		//scanner object
		Scanner input=new Scanner(System.in);
		//user input
		System.out.println("enter a string:");
		String text=input.nextLine().toLowerCase();
		//reverse string
		String rev="";
		for(int i=text.length()-1; i>=0; i--)
		{
			rev+=text.charAt(i);
		}
		System.out.println("Reverse string:"+rev);
		
		//closing input
		input.close();
	}
}