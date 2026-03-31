import java.util.Scanner;

public class BookShelfApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelfManager manager = new BookShelfManager();

        while (true) {
            System.out.println("\n1.Add Book  2.Remove Book  3.Display  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter book genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    manager.addBook(genre, author);
                    break;

                case 2:
                    System.out.print("Enter author name to remove book: ");
                    String removeAuthor = sc.nextLine();

                    manager.deleteBook(removeAuthor);
                    break;

                case 3:
                    manager.displayAllBooks();
                    break;

                case 4:
                    System.out.println("Exiting BookShelf...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
