//scenario based ....* Bus Route Distance Tracker Each stop adds distance. ● Ask if the passenger wants to get off at a stop. ● Use a while-loop with a total distance tracker. ● Exit on user confirmation.

//importing scanner class
import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
		//scanner object
        Scanner input = new Scanner(System.in);
        int totalDistance = 0;
        int stopDistance = 5;  // Assume each stop adds 5 km
        int stopNumber = 1;   

        while (true) {
            // Add distance for this stop
            totalDistance += stopDistance;
            System.out.println("\nStop " + stopNumber + " reached.");
            System.out.println("Distance travelled so far: " + totalDistance + " km");

            // Ask if passenger wants to get off
            System.out.print("Do you want to get off here (yes/no): ");
            String response = input.next().toLowerCase();

            if (response.equals("yes")) {
                System.out.println("You got off at stop " + stopNumber + ".");
                System.out.println("Total distance travelled: " + totalDistance + " km");
                break; 
            }

            // Ask if the passenger wants to continue
            System.out.print("Do you want to continue to the next stop (yes/no): ");
            response = input.next().toLowerCase();

            if (!response.equals("yes")) {
                System.out.println("Bus route ended by passenger.");
                System.out.println("Total distance travelled: " + totalDistance + " km");
                break; 
            }

            stopNumber++; // Move to next stop
        }

        //closing input
        input.close();
    }
}