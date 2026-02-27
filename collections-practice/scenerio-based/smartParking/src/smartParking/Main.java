package smartParking;

public class Main {
    public static void main(String[] args) {

        ParkingManager manager = new ParkingManager();

        // Adding slots
        manager.addSlot(new ParkingSlot(1, "CAR"));
        manager.addSlot(new ParkingSlot(2, "CAR"));
        manager.addSlot(new ParkingSlot(3, "BIKE"));

        // Vehicles
        Vehicle v1 = new Car("CAR123");
        Vehicle v2 = new Car("CAR456");
        Vehicle v3 = new Bike("BIKE789");
        Vehicle v4 = new Car("CAR999");

        manager.parkVehicle(v1);
        manager.parkVehicle(v2);
        manager.parkVehicle(v3);
        manager.parkVehicle(v4);  // Goes to waiting queue

        manager.freeSlot(1); // Should allocate to CAR999
    }
}
