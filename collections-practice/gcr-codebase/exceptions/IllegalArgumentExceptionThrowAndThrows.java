import java.util.Scanner;
public class IllegalArgumentExceptionThrowAndThrows
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount rate years:");
		double amount=sc.nextDouble();
		double rate=sc.nextDouble();
		int years=sc.nextInt();
		try {
		calculateInterest(amount,rate,years);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid input: Amount and rate must be positive:"+e.getMessage());
		}
		sc.close();
	}
	public static void calculateInterest(double amount,double rate,int years) throws IllegalArgumentException
	{
		if(amount<=0 || rate <=0||years<=0)
		{
			throw new IllegalArgumentException("amount or rate cannot be negative");
		}
		else
		{
			double interest=amount*rate*years/100;
			System.out.println("interest:"+interest);
		}
		
	}
}