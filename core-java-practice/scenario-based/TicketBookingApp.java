
//* Movie Ticket Booking App
//importing scanner class
import java.util.Scanner;

public class TicketBookingApp {

	public static void main(String[] args) {

		// creating scanner object
		Scanner input = new Scanner(System.in);
		String continueBooking = "";
		do {
			System.out.println("Select type of movie:");
			System.out.println("1-ComedyMovie 2-AdventurousMovie 3-HorrorMovie");
			int typeOfMovie = input.nextInt();
			input.nextLine();

			int moviePrice = 0;
			String movieType = "";

			switch (typeOfMovie) {
				case 1:
					movieType = "Comedy";
					moviePrice = 200;
					break;
				case 2:
					movieType = "Adventurous";
					moviePrice = 180;
					break;
				case 3:
					movieType = "Horror";
					moviePrice = 220;
					break;
				default:
					System.out.println("Invalid movie choice");
					continue;
			}
			// seat selection
			String seatType = "";
			int seatPrice = 0;
			System.out.println("Enter seat type(gold/silver/normal):");
			seatType = input.nextLine().toLowerCase();
			if (seatType.equals("gold")) {
				seatPrice = 80;
			} else if (seatType.equals("silver")) {
				seatPrice = 50;
			} else if (seatType.equals("normal")) {
				seatPrice = 30;
			} else {
				System.out.println("Invalid seat type");
				continue;

			}
			// snack selection
			System.out.println("Do you want snacks(Yes/No):");
			String snacks = input.nextLine().toLowerCase();
			int snacksPrice = 0;
			if (snacks.equals("yes")) {
				snacksPrice = 40;
			}
			// your booking
			System.out.println("movie type:" + movieType);
			System.out.println("seat type:" + seatType);
			System.out.println("snacks:" + snacks);

			// total bill
			int totalBill = moviePrice + seatPrice + snacksPrice;
			System.out.println("Total bill:" + totalBill);

			System.out.println("want to continue with next booking: (YES/NO)");
			continueBooking = input.nextLine().toLowerCase();
		} while (continueBooking.equals("yes"));
		// closing input
		input.close();
	}

}
