//Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit using the formula
import java.util.Scanner;
public class CelsiusToFahrenheit
{
    public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
		int tempInCelsius=input.nextInt();
		int tempFahrenheit=(tempInCelsius*9/5)+32;
		System.out.println("temperature in celsius:"+tempInCelsius+" and in fahrenheit: "+tempFahrenheit);
		input.close();
	}
}
	