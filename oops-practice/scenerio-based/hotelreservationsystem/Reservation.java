package hotelreservationsystem;

public class Reservation {
    Guest guest;
    Room room;
    int nights;

    public Reservation(Guest guest, Room room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        room.bookRoom();
    }

    public void checkout() {
        room.checkoutRoom();
        System.out.println("Guest " + guest.name + " checked out from room " + room.roomNumber);
    }

    public double calculateBill(PricingStrategy pricing) {
        return pricing.calculatePrice(room, nights);
    }
}
