// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;

    Vehicle(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulation: Getters and setters
    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { currentLocation = newLocation; }

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println("Driver Name: " + getDriverName());
        System.out.println("Rate per Km: " + getRatePerKm());
        System.out.println("Current Location: " + getCurrentLocation());
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);
}

// Car class
class Car extends Vehicle {
    private double carExtraCharge = 50; // extra charge per ride

    Car(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) + carExtraCharge;
    }
}

// Bike class
class Bike extends Vehicle {
    Bike(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance; // no extra charge for bike
    }
}

// Auto class
class Auto extends Vehicle {
    private double autoExtraCharge = 20; // flat charge per ride

    Auto(int vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) + autoExtraCharge;
    }
}

// Main class
public class RideHailingSystem {
    // Method to process fare dynamically using polymorphism
    public static void processFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calculated Fare: " + fare);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        // Creating different vehicle types
        Vehicle car = new Car(101, "Pooja", 15, "City Center");
        Vehicle bike = new Bike(102, "Riya", 10, "Station Road");
        Vehicle auto = new Auto(103, "Rahul", 12, "Market Area");

        double rideDistance = 10; // km

        // Polymorphism: process fare dynamically
        processFare(car, rideDistance);
        processFare(bike, rideDistance);
        processFare(auto, rideDistance);

        // Update location example
        car.updateLocation("Airport");
        System.out.println("Car new location: " + car.getCurrentLocation());
    }
}
