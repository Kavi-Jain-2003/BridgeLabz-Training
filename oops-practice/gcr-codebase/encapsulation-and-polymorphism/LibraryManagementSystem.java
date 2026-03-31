// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class for library items
abstract class LibraryItem implements Reservable {
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;  // default available

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean getAvailability() { return isAvailable; }

    // Setter for availability (encapsulation)
    protected void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Abstract method for loan duration (days)
    public abstract int getLoanDuration();
}

// Book class
class Book extends LibraryItem {
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (getAvailability()) {
            System.out.println(borrowerName + " reserved the book: " + getTitle());
            setAvailability(false);
        } else {
            System.out.println("Book " + getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getAvailability();
    }
}

// Magazine class
class Magazine extends LibraryItem {
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (getAvailability()) {
            System.out.println(borrowerName + " reserved the magazine: " + getTitle());
            setAvailability(false);
        } else {
            System.out.println("Magazine " + getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getAvailability();
    }
}

// DVD class
class DVD extends LibraryItem {
    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (getAvailability()) {
            System.out.println(borrowerName + " reserved the DVD: " + getTitle());
            setAvailability(false);
        } else {
            System.out.println("DVD " + getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getAvailability();
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // Polymorphism: LibraryItem reference for different types
        LibraryItem item1 = new Book(101, "Java Programming", "Author A");
        LibraryItem item2 = new Magazine(102, "Tech Today", "Author B");
        LibraryItem item3 = new DVD(103, "Inception", "Director C");

        // Display details
        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days\n");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days\n");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days\n");

        // Borrower reserves items
        item1.reserveItem("Pooja");
        item2.reserveItem("Riya");
        item3.reserveItem("Rahul");

        System.out.println("\nAfter reservations:");
        item1.getItemDetails();
        item2.getItemDetails();
        item3.getItemDetails();
    }
}
