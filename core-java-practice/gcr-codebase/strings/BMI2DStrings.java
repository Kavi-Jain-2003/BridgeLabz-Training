//An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual

//importing Scanner class
import java.util.Scanner;

public class BMI2DStrings {

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        int number = 10;
        // 2D array to store weight, height, and BMI
        // index 0 -> weight, 1 -> height, 2 -> BMI
        double[][] heightWeight = new double[number][3];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            heightWeight[i][0] = input.nextDouble();
            System.out.print("Enter height (cm): ");
            heightWeight[i][1] = input.nextDouble();
        }
        // Process BMI details
        String[][] bmiDetails = generateBMIDetails(heightWeight);

        // Display result
        displayBMITable(bmiDetails);
        // closing input
        input.close();
    }

    // Method to calculate BMI and Status for one person
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {

        double heightMeter = heightCm / 100; // convert cm to meter
        double bmi = weight / (heightMeter * heightMeter);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[] {
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to generate 2D String array of Height, Weight, BMI, Status
    public static String[][] generateBMIDetails(double[][] heightWeight) {

        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeight[i][0];
            double height = heightWeight[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        return result;
    }

    // Method to display BMI details in tabular format
    public static void displayBMITable(String[][] bmiDetails) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        
        for (int i = 0; i < bmiDetails.length; i++) {
            System.out.println(
                    bmiDetails[i][0] + "\t\t" +
                            bmiDetails[i][1] + "\t\t" +
                            bmiDetails[i][2] + "\t\t" +
                            bmiDetails[i][3]);
        }
    }
}
