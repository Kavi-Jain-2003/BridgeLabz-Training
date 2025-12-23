//Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula

//importing Scanner class
import java.util.Scanner;
public class CelsiusToFahrenheit
{
    public static void main(String[] args)
	{
		//creating scanner object
	    Scanner input=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter temperature in celsius:");
		int tempInCelsius=input.nextInt();
		//coverting celsius to fahrenheit
		int tempFahrenheit=(tempInCelsius*9/5)+32;
		//displaying output
		System.out.println("temperature in celsius:"+tempInCelsius+" and in fahrenheit: "+tempFahrenheit);
		//closing input
		input.close();
	}
}
	