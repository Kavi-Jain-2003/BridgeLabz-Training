
//Rohan’s Library Reminder App
//importing scanner class
import java.util.Scanner;

public class LibraryRemainderApp {

	public static void main(String[] args) {

		// creating scanner object
		Scanner input = new Scanner(System.in);
		final int fine_per_day = 5;
		int total_fine = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("book no.:" + i);
			System.out.println("enter return date:");
			int returnDate = input.nextInt();
			System.out.println("enter due date:");
			int dueDate = input.nextInt();
			
			if (returnDate > dueDate) {
				int lateDays = returnDate-dueDate;
				int fine = lateDays * fine_per_day;
				System.out.println("Returned late by:" + lateDays + " days");
				System.out.println("fine:" + fine);
				total_fine += fine;
			} else {
				System.out.println(" returned on time. no fine");
			}
		}
		System.out.println("You total fine is:" + total_fine);

		// closing input
		input.close();
	}

}
