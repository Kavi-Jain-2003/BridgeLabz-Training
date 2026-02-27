package evcharging;

public class Main {

    public static void main(String[] args) {

        // Choose pricing strategy
        PricingStrategy pricing = new PeakHourPricing();
        // PricingStrategy pricing = new NormalPricing();

        ChargingStationManager manager =
                new ChargingStationManager(pricing);

        // Add slots
        manager.addSlot(new ChargingSlot(1));
        manager.addSlot(new ChargingSlot(2));

        // Vehicles
        Vehicle v1 = new Vehicle("EV101", 5);
        Vehicle v2 = new Vehicle("EV102", 8);
        Vehicle v3 = new Vehicle("EV103", 6);

        try {
            manager.assignVehicle(v1);
            manager.assignVehicle(v2);
            manager.assignVehicle(v3); // may go to waiting
        } catch (NoChargingSlotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
