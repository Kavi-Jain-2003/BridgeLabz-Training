//custom exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}
//interface
interface FareCalculator {
    public abstract void fareCalculator(double distance);
}
//user class
class User {
    private String userName;
    private double distance;

    User(String userName, double distance) {
        this.userName = userName;
        this.distance = distance;
    }
//getter
    String getName() {
        return userName;
    }

    double getDistance() {
        return distance;
    }
}
//driver class
class Driver extends User {
    private String driverName;
    private static boolean driverAvailable = true;

    Driver(String userName, double distance, String driverName) {
        super(userName, distance);
        this.driverName = driverName;
    }

    void checkDriverAvailability() throws NoDriverAvailableException {
        if (!driverAvailable) {
            throw new NoDriverAvailableException("no driver available");
        }
        System.out.println("Driver "+driverName+" is available");
        driverAvailable = false;
    }
//getter
    String getDrivername() {
        return driverName;
    }

    boolean getdriverAvailability() {
        return driverAvailable;
    }

}
//normal pricing
class NormalPricing extends Driver implements FareCalculator {
    private double fareRatePerKm = 20;

    NormalPricing(String userName, double distance, String driverName) {
        super(userName, distance, driverName);
    }
    //overidding  interface method

    @Override
    public void fareCalculator(double distance) {
        if (!getdriverAvailability()) {
            System.out.println("Fare:" + (getDistance() * fareRatePerKm));
        }
    }

    void displayDetail() {
        System.out.println("userName:" + getName());
        System.out.println("distance travel:" + getDistance());
        System.out.println("driverName:" + getDrivername());
    }

}
//peakpricing

class PeakPricing extends Driver implements FareCalculator {
    private double fareRatePerKm = 30;

    PeakPricing(String userName, double distance, String driverName) {
        super(userName, distance, driverName);
    }
//overidding interface method
    @Override
    public void fareCalculator(double distance) {
        if (!getdriverAvailability()) {
            System.out.println("Fare:" + (getDistance() * fareRatePerKm));
        }
    }

    void displayDetail() {
        System.out.println("userName:" + getName());
        System.out.println("distance travel:" + getDistance());
        System.out.println("driverName:" + getDrivername());
    }

}

public class CabBooking {
    public static void main(String[] args) throws NoDriverAvailableException {
        //tryccatch
        try {
            NormalPricing n = new NormalPricing("Pooja", 20, "mahesh");
            n.displayDetail();
            n.checkDriverAvailability();
            n.fareCalculator(n.getDistance());
            PeakPricing p = new PeakPricing("Riya", 15, "Mahesh");
            p.checkDriverAvailability();
            p.displayDetail();
            p.fareCalculator(n.getDistance());
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
