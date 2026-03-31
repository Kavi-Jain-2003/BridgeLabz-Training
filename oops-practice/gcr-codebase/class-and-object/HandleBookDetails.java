//Program to Handle Book Details Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
class Book {
    //attributes
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
        System.out.println(); // For spacing between books
    }
}

// Main class
public class HandleBookDetails {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("2States", "Chetan Bhagat", 500.0);
        Book book2 = new Book("Wings Of Fire", "Abdul Kalam.A.P.J", 500.0);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
    }
}
