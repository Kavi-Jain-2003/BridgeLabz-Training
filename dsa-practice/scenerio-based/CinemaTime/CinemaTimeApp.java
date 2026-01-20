import java.util.Scanner;

public class CinemaTimeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CinemaTimeManager manager = new CinemaTimeManager();

        while (true) {
            System.out.println("\n1.Add Movie  2.Search Movie  3.Display All  4.Print Report  5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter movie title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter show time (HH:MM): ");
                        String time = sc.nextLine();

                        manager.addMovie(title, time);
                        break;

                    case 2:
                        System.out.print("Enter keyword to search: ");
                        String keyword = sc.nextLine();
                        manager.searchMovie(keyword);
                        break;

                    case 3:
                        manager.displayAllMovies();
                        break;

                    case 4:
                        manager.generateReport();
                        break;

                    case 5:
                        System.out.println("Exiting CinemaTime...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InvalidTimeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
