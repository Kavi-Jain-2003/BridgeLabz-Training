import java.util.Scanner;
public class ExceptionPropagation
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		try
		{
			method2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception:"+e.getMessage());
		}
		
	}
	// method1 throws exception
    public static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    // method2 calls method1
    public static void method2() {
        method1();
    }	
}