//Product Inventory Create a Product class with: Instance Variables: productName, price. Class Variable: totalProducts (shared among all products).

public class ProductInventory {
	// attributes
	String productName;
	int price;
	// class variable
	static int totalProducts = 0;

	// parametrized constructor
	ProductInventory(String productName, int price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}

	// instance method
	void displayProductDetails() {
		System.out.println("productName:" + productName);
		System.out.println("price:" + price);
		System.out.println();
	}

	// class method static
	static void displayTotalProducts() {
		System.out.println("total products:" + totalProducts);
	}

	public static void main(String[] args) {
		ProductInventory p1 = new ProductInventory("Laptop", 55000);
		ProductInventory p2 = new ProductInventory("Mobile", 25000);
		ProductInventory p3 = new ProductInventory("Headphones", 2000);

		p1.displayProductDetails();
		p2.displayProductDetails();
		p3.displayProductDetails();

		ProductInventory.displayTotalProducts();

	}
}
