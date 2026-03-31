//Vehicle Management System

class Vehicle // super class
{
     protected int maxSpeed;
    protected String model;

    // Constructor
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
//interface
interface Refuelable {
    void refuel();

}

// subclass
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model)
    {
        super(maxSpeed,model);
    }
     void charge() {
        System.out.println("Electric vehicle " + model + " is charging.");
    }
}
// subclass
class PetrolVehicle extends Vehicle implements Refuelable {
   PetrolVehicle(int maxSpeed, String model)
    {
        super(maxSpeed,model);
    }
//overiding interface method
     @Override
    public void refuel() {
        System.out.println("Petrol vehicle " + model +
                " is refueling. Max speed: " + maxSpeed);
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {
        // accessing methods via child class object
         ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        ev.charge();

        Refuelable pv = new PetrolVehicle(180, "Honda");
        pv.refuel();

    }
}
