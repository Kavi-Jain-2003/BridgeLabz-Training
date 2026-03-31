import java.util.Scanner;

public class TrafficManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrafficManager tm = new TrafficManager();

        while (true) {
            System.out.println("\n1.Add Vehicle  2.Remove Vehicle  3.Display  4.Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter vehicle type: ");
                    String type = sc.nextLine();
                    tm.addVehicle(id, type);
                    break;

                case 2:
                    System.out.print("Enter vehicle id to remove: ");
                    int removeId = sc.nextInt();
                    tm.removeVehicle(removeId);
                    break;

                case 3:
                    tm.displayAllVehicles();
                    break;

                case 4:
                    System.out.println("Exiting Traffic Manager...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
