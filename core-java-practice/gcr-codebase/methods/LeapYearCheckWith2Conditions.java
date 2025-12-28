//Write a program that takes a year as input and outputs the Year is a Leap Year or not 
//importing Scanner class
import java.util.Scanner;

public class LeapYearCheckWith2Conditions {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// User input
		System.out.println("Enter year:");
		int year=input.nextInt();
		boolean isLeapYear=checkForLeapyear(year);
		if(isLeapYear)
		{
			System.out.println("year:"+year+" is a leap year");
		}
		else
		{
			System.out.println("year:"+year+" is not a leap year");
		}
		// closing input
		input.close();
	}

	// Method to check for leap year
	public static boolean checkForLeapyear(int year) {
		//check for year>=1582
		if(year>=1582)
		{
			if((year%4==0&&year%100!=0)||(year%400==0))
			{
				return true;
			}
		}
		return false;
	}
}