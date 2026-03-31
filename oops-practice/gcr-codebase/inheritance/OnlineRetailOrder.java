//Online Retail Order 
class Order // super class
{
    protected int orderId;
    protected String orderDate;

    Order(int orderId, String OrderDate) {
        this.orderId = orderId;
        this.orderDate = OrderDate;
    }
    String getOrderStatus()
    {
        return "order got placed";
    }
}

// subclass
class ShippedOrder extends Order {
    protected int trackingNumber;

    ShippedOrder(int orderId, String orderDate,int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    //overidding parent class method
    @Override
    String getOrderStatus()
    {
        return "order shipped";
    }
}
//subclass
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

     DeliveredOrder(int orderId, String orderDate,int trackingNumber,String deliveryDate) {
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    //overidding parent class method
    @Override
    String getOrderStatus()    {
        return "Order Delivered";
    }
    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

public class OnlineRetailOrder {

    public static void main(String[] args) {
        //accessing methods via child class object
        DeliveredOrder d = new DeliveredOrder(101,"2026-01-01",123456789,"2026-01-05");
        
        d.displayDetails();
    }
}