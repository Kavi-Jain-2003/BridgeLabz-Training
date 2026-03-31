//EcommercePlatform
//interface with abstract methods
interface Taxable {
    public abstract void calculateTax();

    public abstract double getTaxAmount();
}

// abstract class
abstract class Product {
    private int productId;
    private String name;
    protected double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // getter
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return name;
    }

    public double getprice() {
        return price;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
    }
    // abstract method

    abstract double calculateDiscount();

    // polymorphic method
    public void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;

        if (this instanceof Taxable) {
            Taxable t = (Taxable) this;
            t.calculateTax();
            tax = t.getTaxAmount();
        }

        System.out.println("Final Price: " + (price + tax - discount));
        System.out.println("----------------------");
    }

}

// class extending abstract class
class Electronics extends Product implements Taxable {
    private double discount;
    private double tax;
    private double taxPrice;

    Electronics(int productId, String name, double price, double discount, double tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateDiscount() {
        return (price * discount) / 100;
    }

    // overidding interface mathod
    @Override
    public void calculateTax() {
        taxPrice = (price * tax) / 100;
    }

    // overidding interface mathod
    @Override
    public double getTaxAmount() {
        return taxPrice;
    }
}

class Clothing extends Product implements Taxable {

    private double discount;
    private double tax;
    private double taxPrice;

    Clothing(int productId, String name, double price, double discount, double tax) {
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateDiscount() {
        return (price * discount) / 100;
    }

    // overidding interface mathod
    // setter
    @Override
    public void calculateTax() {
        taxPrice = (price * tax) / 100;
    }

    // overidding interface mathod
    @Override
    public double getTaxAmount() {
        return taxPrice;
    }
}

class Groceries extends Product {
    private double discount;

    Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateDiscount() {
        return (price * discount) / 100;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(101, "Headphones", 1200, 10, 7),
                new Clothing(102, "T-Shirt", 500, 15, 7),
                new Groceries(103, "Sugar", 200, 3)
        };

        for (Product p : products) {
            System.out.println("Product: " + p.getProductName());
            p.printFinalPrice(); // polymorphic call
        }
    }
}
