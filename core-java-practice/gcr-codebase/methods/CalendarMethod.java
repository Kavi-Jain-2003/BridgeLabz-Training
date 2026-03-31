//Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month.
//importing scanner class
import java.util.Scanner;

public class CalendarMethod {
	 // Array to store month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store number of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

	public static void main(String[] args) {
		// scanner object		
		Scanner input=new Scanner(System.in);

		 System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        printCalendar(month, year);
		//closing input
		input.close();
	}

	 // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month considering leap year
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonth[month];
        }
    }
	// Method to get first day of the month using Zeller's Congruence
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int q = 1; // first day of the month
        int m = month;
        int K = year % 100;
        int J = year / 100;

        int h = (q + (13*(m + 1))/5 + K + K/4 + J/4 + 5*J) % 7;

        // Convert Zeller's outcome to 0 = Sunday, 1 = Monday ...
        int dayOfWeek = ((h + 6) % 7);
        return dayOfWeek;
    }
	 // Method to print calendar
    public static void printCalendar(int month, int year) {
        System.out.println("\n   " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // move to next line after Saturday
            }
        }
        System.out.println();
    }

}