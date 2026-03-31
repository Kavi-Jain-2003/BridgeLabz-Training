import java.util.*;
import java.util.stream.*;
class Order {
    String customerName;
    double orderTotal;

    Order(String customerName, double orderTotal) {
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }
}


public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Amit", 2500.50),
            new Order("Neha", 1800.00),
            new Order("Amit", 3200.75),
            new Order("Ravi", 1500.00),
            new Order("Neha", 2200.25)
        );
        Map<String,Double> revenuePerCustomer=orders.stream()
        		.collect(Collectors.groupingBy(
        				Order::getCustomerName,
        				Collectors.summingDouble(Order::getOrderTotal)));
        
        revenuePerCustomer.forEach((customer,total)->
        	System.out.println(customer+"->Total revenue:"+total));
}}