package inventorymanagementsystem;

public class Product {

    private String productId;
    private String productName;
    private int stock;

    public Product(String productId, String productName, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }
}
