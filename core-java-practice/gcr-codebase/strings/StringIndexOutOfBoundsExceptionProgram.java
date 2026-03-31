//Write a program to demonstrate StringIndexOutOfBoundsException. 

//importing Scanner class
import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionProgram {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//user input
		System.out.println("enter a string:");
		String text=input.nextLine();
		
		handleStringIndexOutOfBoundsException(text);
		//closing input
		input.close();
	}
	// Method to generate StringIndexOutOfBoundsException
	public static void generateStringIndexOutOfBoundsException(String text)
	{
		System.out.println(text.charAt(text.length()));
	}
	 // Method to handle StringIndexOutOfBoundsException
	public static void handleStringIndexOutOfBoundsException(String text)
	{
		try
		{
			generateStringIndexOutOfBoundsException(text);
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException handled");
		}
	}	
	
}    