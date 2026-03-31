//An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

//importing Scanner class
import java.util.Scanner;

public class BMIArray {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Get input value
		System.out.println("Enter no. of persons:");
		int persons = input.nextInt();
		int[] weight = new int[persons];
		int[] height = new int[persons];
		double[] bmi = new double[persons];
		String[] weightStatus = new String[persons];
		System.out.println("Enter weight:");
		for (int i = 0; i < persons; i++) {
			weight[i] = input.nextInt();
		}
		System.out.println("Enter height:");
		for (int i = 0; i < persons; i++) {
			height[i] = input.nextInt();
		}
		// calculating bmi and getting weight status
		for (int i = 0; i < persons; i++) {
			double heightInMeters = height[i] / 100.0;
			bmi[i] = weight[i] / (heightInMeters * heightInMeters);
			if (bmi[i] <= 18.4) {
				weightStatus[i] = "Underweight";
			} else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
				weightStatus[i] = "Normal";
			} else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
				weightStatus[i] = "Overweight";
			} else {
				weightStatus[i] = "Obese";
			}
		}

		// Display result
		for (int i = 0; i < persons; i++) {
			System.out.println("\nPerson " + (i + 1));
			System.out.println("Weight: " + weight[i] + " kg");
			System.out.println("Height: " + height[i] + " cm");
			System.out.println("BMI: " + bmi[i]);
			System.out.println("Status: " + weightStatus[i]);
		}
		// close input
		input.close();
	}
}
