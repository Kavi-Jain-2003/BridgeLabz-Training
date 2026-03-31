//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. Please define static methods for all the UnitConvertor class methods.
//importing Scanner class
import java.util.Scanner;
public class UnitConvertor3 {
	public static void main(String[] args) {
        //scanner object
        Scanner input=new Scanner(System.in);
		//user inputs
        System.out.println("Enter temperature in Fahrenheit:");
        double farhenheit = input.nextDouble();

        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        System.out.println("Enter weight in kilograms:");
        double kilograms = input.nextDouble();

        System.out.println("Enter volume in gallons:");
        double gallons = input.nextDouble();

        System.out.println("Enter volume in liters:");
        double liters = input.nextDouble();

        // Method calls and outputs
        System.out.println("\nFahrenheit to Celsius: " +
                convertFarhenheitToCelsius(farhenheit));

        System.out.println("Celsius to Fahrenheit: " +
                convertCelsiusToFarhenheit(celsius));

        System.out.println("Pounds to Kilograms: " +
                convertPoundsToKilograms(pounds));

        System.out.println("Kilograms to Pounds: " +
                convertKilogramsToPounds(kilograms));

        System.out.println("Gallons to Liters: " +
                convertGallonsToLiters(gallons));

        System.out.println("Liters to Gallons: " +
                convertLitersToGallons(liters));

        input.close();
    }

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}

