// Election Booth Manager. Design a polling booth system.
import java.util.Scanner;

public class ElectionBoothManager {

   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

       while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age =input.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("Voting process ended.");
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("You are eligible to vote.");

                System.out.println("Vote for your candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote (1/2/3): ");
                int vote = input.nextInt();

                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded successfully ✔");
                } else {
                    System.out.println("Invalid vote! Vote not recorded ❌");
                }

            } else {
                System.out.println("You are NOT eligible to vote.");
            }
        }
	  //close input
      input.close();
   }
}

