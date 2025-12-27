//Write a program to demonstrate NullPointerException. 

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
		
		handleNullPointerException();
	}
	// Method to generate NullPointerException
	public static void generateNullPointerException()
	{
		String text;
		text=null;
		text.length();
	}
	 // Method to handle NullPointerException
	public static void handleNullPointerException()
	{	
		try
		{
			generateNullPointerException();
		}
		catch(NullPointerException ex)
		{
			System.out.println("NullPointerException handled");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException handled");
		}
	}	
}    