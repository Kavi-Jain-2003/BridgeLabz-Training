package ecommercesystem;

class Product {

	private String productId;
	private String productName;
	private int price;
	private int quantity;

	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductId() {
		return productId;
	}

	public int getAmount() {
		return price * quantity;
	}
}
