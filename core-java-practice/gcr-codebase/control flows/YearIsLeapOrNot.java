//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

//importing Scanner class for input
import java.util.Scanner;

public class YearIsLeapOrNot {
    public static void main(String[] args) 
	{
	    //scanner object
        Scanner input = new Scanner(System.in);
		//user input
		int year=input.nextInt();
		if(year>=1582)
		{
			if(year%400==0)
			{
				System.out.println(year+" is a leap year");
			}
			else if(year%100==0)
			{
				System.out.println(year+" is not a leap year");
			}			
			else if(year%4==0)
			{
				System.out.println(year+" is a leap year");
			}			
		}
		else
		{
		    System.out.println("enter year less than or equal to 1852");
		}
			
		
		//closing the input
        input.close();
		
    }
}