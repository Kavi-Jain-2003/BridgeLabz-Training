// Maya’s BMI Fitness Tracker. Maya, a fitness coach, wants to record the BMI of her clients.
//importing scanner class
import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        //creating scanner object
		Scanner input = new Scanner(System.in);
		//taking user input
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        // calculate BMI
        double bmi = weight / (height * height);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);

        input.close();
    }
}
