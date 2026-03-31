package evcharging;

class Vehicle {

    String vehicleNumber;
    double unitsConsumed;

    public Vehicle(String vehicleNumber, double unitsConsumed) {
        this.vehicleNumber = vehicleNumber;
        this.unitsConsumed = unitsConsumed;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }
}
