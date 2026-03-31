package inventorymanagementsystem;

public class InventoryManagementSystem implements AlertService {

    @Override
    public void checkLowStock(Product product) {
        if (product.getStock() <= 5) {
            System.out.println("Low Stock Alert for: " + product.getProductName());
        }
    }

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        InventoryManagementSystem system = new InventoryManagementSystem();

        Product p1 = new Product("P101", "Laptop", 10);
        Product p2 = new Product("P102", "Mouse", 4);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        try {
            inventory.updateStock("P101", -3);
            inventory.updateStock("P102", -2);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        system.checkLowStock(p1);
        system.checkLowStock(p2);
    }
}
