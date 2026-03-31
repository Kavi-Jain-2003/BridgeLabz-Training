//Create a program to find the maximum number of handshakes among N number of students.

//importing Scanner class
import java.util.Scanner;
public class MaxHandshakes
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter number of students:");
		int numberOfStudents=input.nextInt();
		
		//calculating max no. of handshakes
		int maxNumberOfHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
		//displaying output
		System.out.println("No. Of possible handshakes:"+maxNumberOfHandshakes);
		//closing input
		input.close();
	}
}
	