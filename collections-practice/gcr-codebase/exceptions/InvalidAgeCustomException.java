import java.util.Scanner;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);	
		}	
}
public class InvalidAgeCustomException
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age to vote:");
		int age=sc.nextInt();
		try
		{
		validateAge(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Caught custom exception:"+e.getMessage());
		}
		sc.close();
	}
	public static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age less than 18 cannot vote");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
}