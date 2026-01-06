//online food delivery system
// Interface for discount functionality
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// Abstract class for food items
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters 
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setter
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item Name: " + getItemName());
        System.out.println("Price per Unit: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Discountable interface fields
    protected double discountAmount = 0;

    @Override
    public void applyDiscount(double discountPercentage) {
        discountAmount = (calculateTotalPrice() * discountPercentage) / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountAmount;
    }
}

// VegItem class
class VegItem extends FoodItem {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
       
        return getPrice() * getQuantity();
    }
}

// NonVegItem class
class NonVegItem extends FoodItem {

    private double extraChargePerUnit = 20; // additional charge for non-veg

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Total = (price + extraCharge) * quantity
        return (getPrice() + extraChargePerUnit) * getQuantity();
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        // Polymorphism: FoodItem reference for different types
        FoodItem item1 = new VegItem("Paneer Butter Masala", 150, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 200, 3);

        // Display item details and total price
        item1.getItemDetails();
        System.out.println("Total Price: " + item1.calculateTotalPrice());
        item1.applyDiscount(10); // 10% discount
        System.out.println(item1.getDiscountDetails());
        System.out.println("-----------------------------");

        item2.getItemDetails();
        System.out.println("Total Price: " + item2.calculateTotalPrice());
        item2.applyDiscount(5); // 5% discount
        System.out.println(item2.getDiscountDetails());
        System.out.println("-----------------------------");

        // Example of processing multiple items in an order
        FoodItem[] order = {item1, item2};
        double grandTotal = 0;
        System.out.println("Processing Order:");
        for(FoodItem fi : order){
            fi.getItemDetails();
            double total = fi.calculateTotalPrice() - fi.discountAmount;
            System.out.println("Total after Discount: " + total);
            grandTotal += total;
            System.out.println("-----------------------------");
        }
        System.out.println("Grand Total for the Order: " + grandTotal);
    }
}
