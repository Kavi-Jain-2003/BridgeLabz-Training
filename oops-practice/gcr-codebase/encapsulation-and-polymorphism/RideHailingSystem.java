//Ride-Hailing Application
//interface with abstract methods
interface GPS {
    public abstract void getCurrentLocation();

    public abstract void updateLocation(String newLocation);
}

// abstract class
abstract class Vehicle implements GPS{
    private int vehicleId;
    private String driverName;
    protected int ratePerKm;

    Vehicle(int vehicleId, String driverName, int ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // getter
    public int getvehicleId() {
        return vehicleId;
    }

    public String getVehicledriverName() {
        return driverName;
    }

    public double getratePerKm() {
        return ratePerKm;
    }

    // setter
    public void setratePerKm(int ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
    // abstract method

    abstract double calculateFare(double distance);
    public void getvehicleDetails()
    {
        System.out.println("vehicleId:"+getvehicleId());
        System.out.println("vehicledriver name:"+getVehicledriverName());
        System.out.println("rate per km:"+getratePerKm());

    }

   
}

// class extending abstract class
class Car extends Vehicle {
    private String location;

    Car(int vehicleId, String driverName, int ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location=location;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateFare(double distance) {
       return getratePerKm()*distance;
    }

    // overidding interface mathod
    @Override
    public void getCurrentLocation() {
        System.out.println("CurrentLocation:"+location);
    }

    // overidding interface mathod
    @Override
    public void updateLocation(String newLocation) {
        location=newLocation;
        System.out.println("New Location:"+location);       
    }
}
class Bike extends Vehicle {
    private String location;

    Bike(int vehicleId, String driverName, int ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location=location;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateFare(double distance) {
       return getratePerKm()*distance;
    }

    // overidding interface mathod
    @Override
    public void getCurrentLocation() {
        System.out.println("CurrentLocation:"+location);
    }

    // overidding interface mathod
    @Override
    public void updateLocation(String newLocation) {
        location=newLocation;
        System.out.println("New Location:"+location);       
    }
}

class Auto extends Vehicle {
    private String location;

    Auto(int vehicleId, String driverName, int ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location=location;
    }

    // overriding abstarct class abstract method
    @Override
    double calculateFare(double distance) {
       return getratePerKm()*distance;
    }

    // overidding interface mathod
    @Override
    public void getCurrentLocation() {
        System.out.println("CurrentLocation:"+location);
    }

    // overidding interface mathod
    @Override
    public void updateLocation(String newLocation) {
        location=newLocation;
        System.out.println("New Location:"+location);       
    }
}
public class RideHailingSystem {
    public static void main(String[] args) {
       Vehicle c=new Car(101,"Mahesh",40,"Gwalior");
       Vehicle b=new Bike(102,"Rajesh",20,"Gwalior");
       Vehicle a=new Auto(103,"Suresh",10,"Gwalior");
       c.getvehicleDetails();
       c.getCurrentLocation();
       c.calculateFare(15);
       b.getvehicleDetails();
       b.getCurrentLocation();
       b.calculateFare(10);
       a.getvehicleDetails();
       a.getCurrentLocation();
       a.calculateFare(10);

	   
    }
}
