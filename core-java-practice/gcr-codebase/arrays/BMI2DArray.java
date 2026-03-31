//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

//importing Scanner class
import java.util.Scanner;

public class BMI2DArray {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Get input value
		System.out.println("Enter no. of persons:");
		int number = input.nextInt();
		// 2D array to store weight, height, and BMI
        // index 0 -> weight, 1 -> height, 2 -> BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for person " + (i + 1));

            // Weight input with validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();
            } while (personData[i][0] <= 0);

            // Height input with validation
            do {
                System.out.print("Enter height (cm): ");
                personData[i][1] = input.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double heightInMeters = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
		//close the input

        input.close();
    }
}
