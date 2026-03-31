interface IRentable {
    public abstract double calculateRent();
}

abstract class Vehicle {
    protected String vehicleType;
    protected int days;
    protected boolean isActive = true;

    Vehicle(String vehicleType, int days) {
        this.vehicleType = vehicleType;
        this.days = days;
    }

    // update
    public void updateDays(int newDays) {
        this.days = newDays;
        System.out.println("days are updated");
    }

    // delete
    public void deleteVehicle() {
        System.out.println("record is deleted");
        isActive = false;
    }

    public abstract void displayInfo();
}

class Bike extends Vehicle implements IRentable {
    private String BikeId;
    private final double rentPerDay = 20;

    Bike(String BikeId, int days) {
        super("Bike", days);
        this.BikeId = BikeId;
    }

    @Override
    public double calculateRent() {
        return days * rentPerDay;
    }

    @Override
    public void displayInfo() {
        if (!isActive) {
            System.out.println("bike record delelted");
            return;
        }
        System.out.println("VehicleType:" + vehicleType);
        System.out.println("Vehicle ID:" + BikeId);
        System.out.println("days:" + days);
        System.out.println("rentPerDay:" + rentPerDay);
        System.out.println("Rent amount:" + calculateRent());
    }
}

class Car extends Vehicle implements IRentable {
    private String CarId;
    private final double rentPerDay = 30;

    Car(String CarId, int days) {
        super("Car", days);
        this.CarId = CarId;
    }

    @Override
    public double calculateRent() {
        return days * rentPerDay;
    }

    @Override
    public void displayInfo() {
        if (!isActive) {
            System.out.println("car record delelted");
            return;
        }
        System.out.println("VehicleType:" + vehicleType);
        System.out.println("Vehicle ID:" + CarId);
        System.out.println("days:" + days);
        System.out.println("rentPerDay:" + rentPerDay);
        System.out.println("Rent amount:" + calculateRent());
    }
}

class Truck extends Vehicle implements IRentable {
    private String TruckId;
    private final double rentPerDay = 40;

    Truck(String TruckId, int days) {
        super("Truck", days);
        this.TruckId = TruckId;
    }

    @Override
    public double calculateRent() {
        return days * rentPerDay;
    }

    @Override
    public void displayInfo() {
        if (!isActive) {
            System.out.println("truck record delelted");
            return;
        }
        System.out.println("VehicleType:" + vehicleType);
        System.out.println("Vehicle ID:" + TruckId);
        System.out.println("days:" + days);
        System.out.println("rentPerDay:" + rentPerDay);
        System.out.println("Rent amount:" + calculateRent());
    }
}

public class VehicleRentalApplication {
    public static void main(String[] args) {

        // CREATE
        Vehicle b = new Bike("B101", 5);
        Vehicle c = new Car("C101", 3);
        Vehicle t = new Truck("T101", 2);

        // READ
        b.displayInfo();
        System.out.println("------------");
        c.displayInfo();
        System.out.println("------------");
        t.displayInfo();
        System.out.println("------------");

        // UPDATE 
        b.updateDays(7);
        b.displayInfo();
        System.out.println("------------");

        // DELETE 
        t.deleteVehicle();
        t.displayInfo();
    }
}
