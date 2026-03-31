// Book Library System Design a Book class with: ISBN (public). title (protected). author (private). Write methods to: Set and get the author name. Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

class BookLibrarySystem {
	 // access modifiers
    public String ISBN;          // public
    protected String title;      // protected
    private String author;       // private

    // constructor
    BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
	  // setter for author (private variable)
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter for author (private variable)
    public String getAuthor() {
        return author;
    }

    // display method
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends BookLibrarySystem {

    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);          // public
        System.out.println("Title: " + title);        // protected
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("Format: " + fileFormat);
        System.out.println();
    }
}

// main class
public class LibrarySystem {

    public static void main(String[] args) {

        EBook ebook =
                new EBook("978-0134685991", "Effective Java", "Joshua Bloch", "PDF");

        ebook.displayEBookDetails();

        // modifying private member using public method
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
