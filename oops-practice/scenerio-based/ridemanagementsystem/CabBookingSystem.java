package ridemanagementsystem;

public class CabBookingSystem {

    public static void main(String[] args) {

        User user = new User("U101", "Amit");
        Ride ride = new Ride(user, 8);

        FareCalculator fareCalculator = new PeakFareCalculator();
        DriverManager driverManager = new DriverManager();

        try {
            Driver driver = driverManager.getAvailableDriver();
            ride.assignDriver(driver);

            double fare = fareCalculator.calculateFare(ride.getDistance());
            ride.setFare(fare);

            ride.endRide();

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
