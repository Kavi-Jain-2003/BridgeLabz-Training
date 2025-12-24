//Create a program to print a multiplication table of a number.
//importing scanner class
import java.util.Scanner;

public class MultiplicationTableArray {
	public static void main(String[] args) {
		// creating scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:");
		int number=input.nextInt();
		// creating array
		int[] table = new int[10];
		//calcualte table
		for(int i=1; i<=10; i++)
		{
		    table[i-1]=number*(i);
		}
		//display table
		for(int i=1; i<=10; i++)
		{
		   System.out.println(number+"*"+i+"="+table[i-1]);
		}
		// closing input
		input.close();
	}
}
