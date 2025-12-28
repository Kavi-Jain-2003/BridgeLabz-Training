//Write a program calculate the wind chill temperature given the temperature and wind speed

//importing Scanner class
import java.util.Scanner;

public class WindChillTemperature {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);		
        // User input
        System.out.println("Enter temperature (in Fahrenheit):");
        double temperature = input.nextDouble();

        System.out.println("Enter wind speed (in mph):");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + windChill);
        
		// closing input
		input.close();
	}

	// Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }
}