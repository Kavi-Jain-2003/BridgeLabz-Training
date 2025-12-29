//Festival Lucky Draw At Diwali mela, each visitor draws a number.  If the number is divisible by 3 and 5, they win a gift.  Use if, modulus, and loop for multiple visitors.  continue if input is invalid.

//importing scanner class
import java.util.Scanner;

public class FestivalLuckyDraw {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		// user input
		System.out.print("Enter the number of visitors: ");
		int numVisitors = input.nextInt();

		for (int i = 1; i <= numVisitors; i++) {
			System.out.println("\nVisitor " + i + ":");
			System.out.print("Enter your lucky number: ");
			int luckyNumber = input.nextInt();
			if (luckyNumber <= 0) {
				System.out.print("you entered an invalid number ");
				i--;
				continue;
			}
			if (luckyNumber % 3 == 0 && luckyNumber % 5 == 0) {
				System.out.print("You win the prize!!! ");
			} else {
				System.out.print("Better luck next time!!! ");
			}

		}
		// closing input
		input.close();

	}
}