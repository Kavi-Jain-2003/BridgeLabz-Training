//Problem 4: Date Comparison Write a program that: ➢ Takes two date inputs and compares them to check if the first date is before, after, or the same as the second date.
//importing class
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Define a date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInput = input.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);

        // Input second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInput = input.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput, formatter);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println(firstDate + " is before " + secondDate);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println(firstDate + " is after " + secondDate);
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println(firstDate + " is the same as " + secondDate);
        }
		//closing input
		input.close();

	}

}

