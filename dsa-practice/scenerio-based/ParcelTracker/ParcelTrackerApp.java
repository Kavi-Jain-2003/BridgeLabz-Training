import java.util.Scanner;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTrackerManager manager = new ParcelTrackerManager();

        // default stages
        manager.addStage("Packed");
        manager.addStage("Shipped");
        manager.addStage("In Transit");
        manager.addStage("Delivered");

        while (true) {
            System.out.println("\n1.Track Parcel  2.Add Checkpoint  3.Check Status  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    manager.trackParcel();
                    break;

                case 2:
                    System.out.print("Enter existing stage: ");
                    String existing = sc.nextLine();

                    System.out.print("Enter new checkpoint stage: ");
                    String newStage = sc.nextLine();

                    manager.addStageAfter(existing, newStage);
                    break;

                case 3:
                    manager.checkParcelStatus();
                    break;

                case 4:
                    System.out.println("Exiting Parcel Tracker...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
