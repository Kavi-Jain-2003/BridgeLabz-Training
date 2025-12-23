//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

public class HarryAge
{
    public static void main(String[] args)
	{
		//initialising variables
	    int birthYear=2000;
		int currentYear=2024;
		//calculating harryAge
		int harryAge=currentYear-birthYear;
		//displaying output
		System.out.println("Harry's Age in "+currentYear+" is "+ harryAge);
	}
}
