import java.util.InputMismatchException;
import java.util.Scanner;
public class ArithmeticAndInputMismatchException
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("to perform division opration:");		
		try
		{
			System.out.println("enter first no.:");
			int n1=sc.nextInt();
			System.out.println("enter second no.:");
			int n2=sc.nextInt();
			int result=n1/n2;	
			System.out.println("result:"+result);
			sc.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatc exception occurs:"+e.getMessage());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs:"+e.getMessage());
			
		}
	}
	
}