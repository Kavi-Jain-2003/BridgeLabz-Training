package ridemanagementsystem;

public class Ride {

	private User user;
	private Driver driver;
	private double distance;
	private double fare;

	public Ride(User user, double distance) {
		this.user = user;
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	public void assignDriver(Driver driver) {
		this.driver = driver;
		driver.assignDriver();
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public void endRide() {
		driver.releaseDriver();
		System.out.println("Ride completed for " + user.getName());
		System.out.println("Driver: " + driver.getName());
		System.out.println("Fare: " + fare);
	}
}
