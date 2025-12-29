//Problem 3: Date Formatting Write a program that: ➢ Displays the current date in three different formats: ■ dd/MM/yyyy ■ yyyy-MM-dd ■ EEE, MMM dd, yyyy
//importing class
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
	public static void main(String[] args) {
		 // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define different date formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display the current date in different formats
        System.out.println("Current date in dd/MM/yyyy format: " + currentDate.format(format1));
        System.out.println("Current date in yyyy-MM-dd format: " + currentDate.format(format2));
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
	}

}

