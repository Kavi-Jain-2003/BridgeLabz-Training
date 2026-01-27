import java.util.Scanner;

public class ArithmeticExceptionFinally
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("integer division");
		System.out.println("enter dividend:");
		int dividend=sc.nextInt();
		System.out.println("enter divisor:");
		int divisor=sc.nextInt();
		try
		{
			double result=dividend/divisor;
			System.out.println("result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception:"+e.getMessage());
			
		}
		finally
		{
			System.out.println("operation completed");
		}
		sc.close();
	}
}