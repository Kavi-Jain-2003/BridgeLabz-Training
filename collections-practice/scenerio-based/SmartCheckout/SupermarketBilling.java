import java.util.*;

public class SupermarketBilling {

    public static void main(String[] args) {

        // Queue to store customer names
        Queue<String> queue = new LinkedList<>();

        // HashMap to store item prices
        HashMap<String, Integer> price = new HashMap<>();
        price.put("Milk", 50);
        price.put("Bread", 40);

        // HashMap to store item stock
        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Milk", 5);
        stock.put("Bread", 3);

        // Add customers to queue
        queue.add("Amit");
        queue.add("Riya");

        // Process customers
        while (!queue.isEmpty()) {

            String customer = queue.poll(); // remove customer
            System.out.println("\nBilling for " + customer);

            int total = 0;

            // Simple items for every customer
            String[] items = {"Milk", "Bread"};

            for (String item : items) {

                if (stock.get(item) > 0) {
                    total += price.get(item);
                    stock.put(item, stock.get(item) - 1);
                    System.out.println(item + " : " + price.get(item));
                } else {
                    System.out.println(item + " is out of stock");
                }
            }

            System.out.println("Total Bill:" + total);
        }

        // Show remaining stock
        System.out.println("\nRemaining Stock:");
        for (String item : stock.keySet()) {
            System.out.println(item + " : " + stock.get(item));
        }
    }
}
