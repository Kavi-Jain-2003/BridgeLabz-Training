import java.util.Scanner;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserHistoryManager manager = new BrowserHistoryManager();

        while (true) {
            System.out.println("\n1.Visit Page  2.Back  3.Forward  4.Close Tab  5.Restore Tab  6.Show History  7.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter page URL: ");
                    String url = sc.nextLine();
                    manager.visitPage(url);
                    break;

                case 2:
                    manager.goBack();
                    break;

                case 3:
                    manager.goForward();
                    break;

                case 4:
                    manager.closeTab();
                    break;

                case 5:
                    manager.restoreTab();
                    break;

                case 6:
                    manager.showHistory();
                    break;

                case 7:
                    System.out.println("Exiting BrowserBuddy...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
