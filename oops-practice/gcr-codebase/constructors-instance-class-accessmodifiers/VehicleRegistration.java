// Vehicle Registration:Create a Vehicle class to manage the details of vehicles: Instance Variables: ownerName, vehicleType. Class Variable: registrationFee (fixed for all vehicles). Methods: An instance method displayVehicleDetails() to display owner and vehicle details. A class method updateRegistrationFee() to change the registration fee. 

public class VehicleRegistration {
	// attributes
	String ownerName;
	String vehicleType;
	// class variable
	static double registrationFee = 1500.0;

	// parametrized constructor
	VehicleRegistration(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType= vehicleType;
	}

	// instance method
	void displayVehicleDetails() {
		System.out.println("ownerName:" + ownerName);
		System.out.println("vehicleType" + vehicleType);
		System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
	}

	// class method static
	static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}

	public static void main(String[] args) {
		 VehicleRegistration v1 = new VehicleRegistration("Amit", "Car");
        VehicleRegistration v2 = new VehicleRegistration("Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // updating registration fee for all vehicleRegistrations
        VehicleRegistration.updateRegistrationFee(2000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

	}
}
