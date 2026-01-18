package ecommercesystem;

public class Order {

    private String orderId;
    private Product product;
    private Customer customer;
    private String status;

    public Order(String orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "CREATED";
    }
    public String getOrderId()
    {
        return orderId;
    }

        public String getStatus()
    {
        return status;
    }
        public Customer getCustomer()
    {
        return customer;
    }
    

    public void placeOrder() {
        if (product == null) {
            System.out.println("Order cannot be placed. Product is null");
            return;
        }
        status = "PLACED";
        System.out.println("Order placed for product: " + product.getProductName());
    }

    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order cancelled");
    }
    
}
