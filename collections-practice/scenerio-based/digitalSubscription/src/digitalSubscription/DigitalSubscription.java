package digitalSubscription;

import java.time.LocalDate;
import java.util.*;

// Custom Exception
class PaymentDeclinedException extends Exception {
    public PaymentDeclinedException(String message) {
        super(message);
    }
}

// Strategy Interface (Discount Strategy)
interface DiscountStrategy {
    double applyDiscount(double amount);
}

// No Discount
class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount;
    }
}

// Festival Discount (20%)
class FestivalDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}

// User Class (Encapsulation + OOP)
class User {

    private String name;
    private LocalDate expiryDate;
    private boolean active;

    public User(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public boolean isActive() {
        return active;
    }

    // Auto Renew
    public void renewSubscription(double amount, DiscountStrategy strategy)
            throws PaymentDeclinedException {

        if (Math.random() < 0.2) {   // simulate payment failure
            throw new PaymentDeclinedException("Payment Declined for " + name);
        }

        double finalAmount = strategy.applyDiscount(amount);
        expiryDate = expiryDate.plusMonths(1);

        System.out.println(name + " renewed. Paid: ₹" + finalAmount);
    }

    // Check expiry
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            active = false;
            System.out.println(name + " subscription expired.");
        }
    }
}

// Main Class
public class DigitalSubscription {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Rahul", LocalDate.now().minusDays(2))); // expired
        users.add(new User("Priya", LocalDate.now().plusDays(5)));  // active
        users.add(new User("Aman", LocalDate.now()));               // today

        DiscountStrategy strategy = new FestivalDiscount();
        double subscriptionAmount = 500;

        for (User user : users) {

            user.checkExpiry();

            if (user.isActive()) {
                try {
                    user.renewSubscription(subscriptionAmount, strategy);
                } catch (PaymentDeclinedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
