import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Book class
class Book {
    private String title;
    private String author;
    private boolean isAvailable; // true = available, false = checked out

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkout() throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException("Book '" + title + "' is currently unavailable!");
        }
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + " by " + author + " [" + (isAvailable ? "Available" : "Checked Out") + "]";
    }
}

// Library Management System
public class LibraryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static List<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        // Sample book data using array
        Book[] booksArray = {
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("1984", "George Orwell"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald")
        };

        // Add books to the library list
        for (Book b : booksArray) {
            library.add(b);
        }

        System.out.println("===== Welcome to Library Management System =====");
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Display all books");
            System.out.println("2. Search books by title");
            System.out.println("3. Checkout a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    System.out.print("Enter partial or full title to search: ");
                    String searchTitle = sc.nextLine();
                    searchBooks(searchTitle);
                    break;
                case 3:
                    System.out.print("Enter exact title to checkout: ");
                    String checkoutTitle = sc.nextLine();
                    checkoutBook(checkoutTitle);
                    break;
                case 4:
                    System.out.print("Enter exact title to return: ");
                    String returnTitle = sc.nextLine();
                    returnBook(returnTitle);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }

    // Display all books
    public static void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book b : library) {
            System.out.println(b);
        }
    }

    // Search books by partial title
    public static void searchBooks(String partialTitle) {
        System.out.println("\nSearch Results for '" + partialTitle + "':");
        boolean found = false;
        for (Book b : library) {
            if (b.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching '" + partialTitle + "'.");
        }
    }

    // Checkout book
    public static void checkoutBook(String title) {
        for (Book b : library) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                try {
                    b.checkout();
                    System.out.println("You have successfully checked out: " + b.getTitle());
                } catch (BookNotAvailableException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    // Return book
    public static void returnBook(String title) {
        for (Book b : library) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                System.out.println("Book returned successfully: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not found in library.");
    }
}
