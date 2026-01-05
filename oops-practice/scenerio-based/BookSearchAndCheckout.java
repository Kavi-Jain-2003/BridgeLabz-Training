//Library Management System – Book Search and Checkout Scenario: You’re designing a system for a small library to manage books and track checkouts.
//importing scanner class
import java.util.Scanner;

class BookSearchAndCheckout {
    //search book by partial title
    public static void searchBook(String[] bookDetails,String searchBookName)
    {
        if(bookDetails[0].toLowerCase().contains(searchBookName.toLowerCase()))
        {
            System.out.println("your Book found");
            displayBookDetails(bookDetails);
        }
        else
        {
            System.out.println("Not found");
        }
    }
    //display book details
    public static void displayBookDetails(String[] bookDetails)
    {
        System.out.println("Title:"+bookDetails[0]);
        System.out.println("Author:"+bookDetails[1]);
        System.out.println("Status:"+bookDetails[2]);
    }
    // Update book status
    public static void updateStatus(String[] book) {
        if (book[2].equalsIgnoreCase("Available")) {
            book[2] = "Checked Out";
            System.out.println("Book has been checked out.");
        } else {
            System.out.println("Book is already checked out.");
        }
    }
    public static void main(String[] args) {
        // scanner object
        Scanner input = new Scanner(System.in);
        // user input
         // Store book details in array
        String[] book = new String[3];

        System.out.println("Enter book title:");
        book[0] = input.nextLine();

        System.out.println("Enter author name:");
        book[1] = input.nextLine();

        book[2] = "Available"; // default status

        System.out.println("Enter title to search:");
        String searchTitle = input.nextLine();

        searchBook(book, searchTitle);
        updateStatus(book);

        System.out.println("Updated book details:");
        displayBookDetails(book);
        // closing input
        input.close();
    }

   
}
