//Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.

public class CarRental {
	// attributes
	String customerName;
	String carModel;
	int rentalDays;

	// parametrized constructor
	CarRental(String customerName, String carModel, int rentalDays) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}

	double totalCost() {
		return 10000 * rentalDays;
	}

	// instance method
	void displayDetail() {
		System.out.println("customerName:" + customerName);
		System.out.println("carModel:" + carModel);
		System.out.println("rentalDays:" + rentalDays);
		System.out.println("totalCost:" + totalCost());
		System.out.println();

	}

	public static void main(String[] args) {
		CarRental c1 = new CarRental("Pooja", "BMW", 4);
		c1.displayDetail();

	}
}
