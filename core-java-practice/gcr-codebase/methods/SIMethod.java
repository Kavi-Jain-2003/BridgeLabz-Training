//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

//importing Scanner class
import java.util.Scanner;

public class SIMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter principal:");
        int principal = input.nextInt();
		System.out.println("Enter rate:");
        int rate = input.nextInt();
		System.out.println("Enter time:");
        int time = input.nextInt();
		double simpleinterest=calculateSI(principal,rate,time);
		System.out.println("Simple interest is:"+simpleinterest+" for Principal "+principal+", rate of interest "+rate+" and time "+time);
        
		// closing input
		input.close();
	}

	//calculating simple interest
	public static double calculateSI(int p, int r, int t)
	{
		double si=(p*r*t)/100;
		return si;
	}
}