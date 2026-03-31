package inventorymanagementsystem;

public class Inventory {

    private Product[] products = new Product[5];
    private int count = 0;

    public void addProduct(Product product) {
        products[count++] = product;
        System.out.println("Product added: " + product.getProductName());
    }

    public Product findProduct(String productId) {
        for (int i = 0; i < count; i++) {
            if (products[i].getProductId().equals(productId)) {
                return products[i];
            }
        }
        return null;
    }

    public void updateStock(String productId, int quantity)
            throws OutOfStockException {

        Product product = findProduct(productId);

        if (product == null) {
            System.out.println("Product not found");
            return;
        }

        if (product.getStock() + quantity < 0) {
            throw new OutOfStockException("Not enough stock available");
        }

        product.updateStock(quantity);
        System.out.println("Stock updated for " + product.getProductName());
    }
}
