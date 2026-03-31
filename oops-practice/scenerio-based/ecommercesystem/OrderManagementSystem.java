package ecommercesystem;

public class OrderManagementSystem {

    public static void main(String[] args) {

        // Create product
        Product product = new Product("P101", "Mobile", 1000, 2);

        // Create customer
        Customer customer = new Customer("C101", "Pooja");

        // Create order
        Order order = new Order("O101", product, customer);

        // Place order
        order.placeOrder();

   
        Payment payment = new CardPayment();

        try {
            payment.pay(product.getAmount());
            System.out.println("Payment successful");
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
