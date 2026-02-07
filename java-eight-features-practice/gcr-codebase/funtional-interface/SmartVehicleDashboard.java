interface VehicleDashboard {

    void displaySpeed();

    // New feature added later
    default void displayBatteryPercentage() {
        // Default behavior for non-electric vehicles
        System.out.println("Battery information not available");
    }
}
class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}
class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery: 85%");
    }
}
public class SmartVehicleDashboard {

    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed();
        petrol.displayBatteryPercentage();

        electric.displaySpeed();
        electric.displayBatteryPercentage();
    }
}
