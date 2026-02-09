public class Order {
    private String orderId;
    private String location;   // delivery location

    public Order(String orderId, String location) {
        this.orderId = orderId;
        this.location = location;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return orderId + " (" + location + ")";
    }
}
