class Item {
    String itemCode;
    String itemName;
    double price;

    // Constructor to initialize item details
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println();
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class InventoryItem {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("01AA", "Water bottle", 500.0);
        Item item2 = new Item("01BB", "Rice", 700.0);
        Item item3 = new Item("02AA", "Blackboard", 400.0);

        // Displaying item details
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();

        int quantity = 3;
        System.out.println("Total cost of 3 Water bottles: " + item1.calculateTotalCost(quantity));
    }
}
