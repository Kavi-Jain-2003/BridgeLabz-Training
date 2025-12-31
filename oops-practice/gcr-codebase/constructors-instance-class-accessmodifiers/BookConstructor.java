//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
public class BookConstructor {
	// attributes
	String title;
	String author;
	int price;

	// default constructor
	BookConstructor() {
		title = "the secret";
		author = "Rhonda byrne";
		price = 2500;
	}	// parametrized constructor
	BookConstructor(String title,String author, int price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}

	// instance method
	void displayBookDetail() {
		System.out.println("title:" + title);
		System.out.println("author:" + author);
		System.out.println("price:" + price);
	}

	public static void main(String[] args) {
		BookConstructor b = new BookConstructor();
		b.displayBookDetail();
	}
}
