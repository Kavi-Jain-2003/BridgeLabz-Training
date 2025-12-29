//roblem 2: Date Arithmetic Create a program that: ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it. ➢ Then subtracts 3 weeks from the result.
//importing class
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		// scanner object
	Scanner input = new Scanner(System.in);
		 // Define a date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input a date from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = input.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        System.out.println("Original date: " + date.format(formatter));

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + newDate.format(formatter));

        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
		//closing input
		input.close();
	}

}

