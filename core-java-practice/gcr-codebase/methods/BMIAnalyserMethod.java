//An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

//importing Scanner class
import java.util.Scanner;

public class BMIAnalyserMethod {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		double[][] data = new double[10][3];

        // Taking user input
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI Status
        String[] status = getBMIStatus(data);
			 // Display Result
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
		for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }


		// closing input
		input.close();
	}

	 // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height from cm to meters
            double heightMeter = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;
        }
    }
	// Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
	}
}