//* Festival Lucky Draw At Diwali mela, each visitor draws a number. ● If the number is divisible by 3 and 5, they win a gift. ● Use if, modulus, and loop for multiple visitors. ● continue if input is invalid.

//importing scanner class
import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVisitors;

        System.out.print("Enter the number of visitors: ");
        numVisitors = sc.nextInt();

        for (int i = 1; i <= numVisitors; i++) {
            System.out.println("\nVisitor " + i + ":");
            System.out.print("Enter your lucky number: ");

            if (!sc.hasNextInt()) { // Check if input is valid integer
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Consume invalid input
                i--; // Repeat for this visitor
                continue;
            }

            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Invalid number! Must be positive.");
                i--; // Repeat for this visitor
                continue;
            }

            // Check if number divisible by 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift 🎁");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }
        }

        System.out.println("\nThank you for participating in the Festival Lucky Draw 🎉");
        sc.close();
    }
}