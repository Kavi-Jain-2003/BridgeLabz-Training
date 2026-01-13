package ridemanagementsystem;

public class DriverManager {

    private Driver[] drivers = new Driver[2];
    private int count = 0;

    public DriverManager() {
        drivers[count++] = new Driver("D1", "Ramesh");
        drivers[count++] = new Driver("D2", "Suresh");
    }

    public Driver getAvailableDriver() throws NoDriverAvailableException {
        for (int i = 0; i < count; i++) {
            if (drivers[i].isAvailable()) {
                return drivers[i];
            }
        }
        throw new NoDriverAvailableException("No drivers available at the moment");
    }
}

