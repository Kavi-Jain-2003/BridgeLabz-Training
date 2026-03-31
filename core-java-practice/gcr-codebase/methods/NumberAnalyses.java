//Write a program to check whether a number is positive, negative, or zero.

//importing Scanner class
import java.util.Scanner;

public class NumberAnalyses {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter a number:");
        int number = input.nextInt();
		//output
		int numberStatus=numberchecker(number);
		if(numberStatus==1)
		{
			System.out.println("the number:"+number+" is positive");
		}
		else if(numberStatus==-1)
		{
			System.out.println("the number:"+number+" is negative");
		}
		else
		{
			System.out.println("the number:"+number+" is zero");
		}
		// closing input
		input.close();
	}

	//check whether no. is positive negative or zero
	public static int numberchecker(int num)
	{
		if(num>0)
		{
			return 1;
		}
		else if(num<0)
		{
			return -1;
		}
		return 0;
	}
}