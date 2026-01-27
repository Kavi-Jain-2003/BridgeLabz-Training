import java.util.Scanner;

public class NestedTryCatch
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter 5 array elements:");
	        int[] arr = new int[5];

	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }

	        try
	        {
	        	System.out.println("Enter index no. to get that value:");
	        	int index = sc.nextInt();
	        	int dividend=arr[index];
	        	try
	        	{
	        		System.out.println("Enter divisor to divide that index value:");
	    	        int divisor = sc.nextInt();
	    	        int result=dividend/divisor;
	    	        System.out.println("result:"+result);
	        	}
	        	catch(ArithmeticException e)
	        	{
	        		System.out.println("divisor can't be zero");
	        	}
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	        	System.out.println("invalid array index!!");
	        	
	        }
	        sc.close();
	}
}