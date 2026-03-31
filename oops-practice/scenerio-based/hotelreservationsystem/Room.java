package hotelreservationsystem;

public class Room {
    String roomNumber;
    boolean available;
    double basePrice;

    public Room(String roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void checkoutRoom() {
        available = true;
    }
}
