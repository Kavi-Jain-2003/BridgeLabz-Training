package ridemanagementsystem;

public class Driver {

    private String driverId;
    private String name;
    private boolean available;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignDriver() {
        this.available = false;
    }

    public void releaseDriver() {
        this.available = true;
    }

    public String getName() {
        return name;
    }
}
