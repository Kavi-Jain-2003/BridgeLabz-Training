//VehicleRentalSystem
//interface with abstract methods
interface Insurable {
    public abstract void calculateInsurance();

    public abstract double getInsuranceAmount();
}

// abstract class
abstract class Vehicle implements Insurable{
    private int vehicleNumber;
    private String vehicleType;
    protected double rentalRate;
    protected double insuranceAmount;

    Vehicle(int vehicleNumber, String vehicleType, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    // getter
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return vehicleType;
    }

    public double getRentalRate() {
        return rentalRate;
    }

      // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        System.out.println("Rental Rate: " + getRentalRate() + " per day");
    }

   
}

// class extending abstract class
class Car extends Vehicle {
    private double discountRate=5;

    Car(int vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    // overriding abstarct class abstract method
    @Override
    public double calculateRentalCost(int days) {
        double cost=days*rentalRate;
        cost-=cost*discountRate/100;
        return cost;
    }

    // overidding interface mathod
    @Override
    public void calculateInsurance() {
        insuranceAmount=rentalRate*0.1;
        
    }

    // overidding interface mathod
    @Override
    public double getInsuranceAmount() {
        return insuranceAmount;
    }
}

class Bike extends Vehicle {

    private double discountRate=5;

    Bike(int vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    // overriding abstarct class abstract method
    @Override
    public double calculateRentalCost(int days) {
        double cost=days*rentalRate;
        cost-=cost*discountRate/100;
        return cost;
    }

    // overidding interface mathod
    @Override
    public void calculateInsurance() {
        insuranceAmount=rentalRate*0.1;
        
    }

    // overidding interface mathod
    @Override
    public double getInsuranceAmount() {
        return insuranceAmount;
    }
}

class Truck extends Vehicle {
    private double discountRate=5;

    Truck(int vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    // overriding abstarct class abstract method
    @Override
    public double calculateRentalCost(int days) {
        double cost=days*rentalRate;
        cost-=cost*discountRate/100;
        return cost;
    }

    // overidding interface mathod
    @Override
    public void calculateInsurance() {
        insuranceAmount=rentalRate*0.1;
        
    }

    // overidding interface mathod
    @Override
    public double getInsuranceAmount() {
        return insuranceAmount;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
         Vehicle[] vehicles = {
            new Car(101, 2000),
            new Bike(202, 500),
            new Truck(303, 5000)
        };

        int rentalDays = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails();

            double rentalCost = v.calculateRentalCost(rentalDays);
            v.calculateInsurance();

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance Amount: " + v.getInsuranceAmount());
            System.out.println("----------------------");
        }
    }
}
