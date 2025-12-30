//Program to Simulate a Shopping Cart Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to: ● Add an item to the cart. ● Remove an item from the cart. ● Display the total cost.
// CartItem class
class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add quantity to the cart
    public void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    // Method to remove quantity from the cart
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove " + qty + ". Only " + quantity + " available in cart.");
        }
    }

    // Method to calculate total cost
    public double totalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.printf("Item: %s, Price: $%.2f, Quantity: %d%n", itemName, price, quantity);
    }
}

// Main class
public class SimulateShoppingCart {
    public static void main(String[] args) {
        // Create a CartItem object
        CartItem item = new CartItem("Laptop", 999.99, 1);

        // Display initial item
        item.displayItem();

        // Add 2 more laptops
        item.addItem(2);

        // Remove 1 laptop
        item.removeItem(1);

        // Display total cost
        System.out.printf("Total cost: $%.2f%n", item.totalCost());
    }
}
