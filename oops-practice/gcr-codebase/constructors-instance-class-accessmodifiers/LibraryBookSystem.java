//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.

public class LibraryBookSystem {
	// attributes
	String title;
	String author;
	double price;
	boolean availability;

	// parametrized constructor
	LibraryBookSystem(String title,String author, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.availability=true;
	}
//check availability
	void borrowBook() {
		if (availability) {
			availability = false;
			System.out.println("Book issued successfully");
		} else {
			System.out.println("Book is not available");
		}
	}

	// instance method
	void displayDetail() {
		System.out.println("title:" + title);
		System.out.println("author:" + author);
		System.out.println("price:" + price);
		System.out.println("Available:" + availability);
		System.out.println();

	}

	public static void main(String[] args) {
		LibraryBookSystem l1 = new LibraryBookSystem("Java Programming", "James Gosling", 499.99);
		l1.displayDetail();
		l1.borrowBook();//borrow 1
		l1.borrowBook();//borrow 2
		l1.displayDetail();

	}
}
