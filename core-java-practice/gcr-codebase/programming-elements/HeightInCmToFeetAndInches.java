//Write a program that takes your height i cenimeters and convert it into feet and inches

import java.util.Scanner;

public class HeightInCmToFeetAndInches {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightInCm / 2.54;

        // Convert inches to feet and inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your height is " , feet , " feet %.2f", inches , " inches");

        input.close();
    }
}
