import java.util.*;

public class CartManager {

    // Product -> Price
    HashMap<String, Double> priceMap = new HashMap<>();          // Fast lookup
    LinkedHashMap<String, Double> cartOrderMap = new LinkedHashMap<>(); // Maintains order added
    TreeMap<Double, List<String>> priceSortedMap = new TreeMap<>();    // Sorted by price

    // Add a product to cart
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
        cartOrderMap.put(product, price);

        // TreeMap: handle duplicate prices
        priceSortedMap.putIfAbsent(price, new ArrayList<>());
        priceSortedMap.get(price).add(product);
    }

    // Display HashMap (unordered)
    public void displayHashMap() {
        System.out.println("Products (HashMap - unordered):");
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
        System.out.println();
    }

    // Display LinkedHashMap (insertion order)
    public void displayLinkedHashMap() {
        System.out.println("Products (LinkedHashMap - order added):");
        for (Map.Entry<String, Double> entry : cartOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
        System.out.println();
    }

    // Display TreeMap (sorted by price)
    public void displayTreeMap() {
        System.out.println("Products (TreeMap - sorted by price):");
        for (Map.Entry<Double, List<String>> entry : priceSortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
        }
        System.out.println();
    }

    // Calculate total cart value
    public double totalValue() {
        double total = 0;
        for (double price : cartOrderMap.values()) {
            total += price;
        }
        return total;
    }

    public static void main(String[] args) {

        CartManager cart = new CartManager();

        // Add products
        cart.addProduct("Laptop", 50000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);
        cart.addProduct("Monitor", 12000);
        cart.addProduct("Headphones", 1500);

        // Display different views
        cart.displayHashMap();
        cart.displayLinkedHashMap();
        cart.displayTreeMap();

        // Show total
        System.out.println("Total Cart Value: ₹" + cart.totalValue());
    }
}
