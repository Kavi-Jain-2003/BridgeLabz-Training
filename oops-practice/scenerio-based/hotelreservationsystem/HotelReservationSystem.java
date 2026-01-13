package hotelreservationsystem;

public class HotelReservationSystem {

    public static void main(String[] args) {

        // Rooms
        Room r1 = new DeluxeRoom("D101");
        Room r2 = new StandardRoom("S201");

        // Guests
        Guest g1 = new Guest("Alice");
        Guest g2 = new Guest("Bob");

        // Pricing
        PricingStrategy peakPricing = new SeasonalPricing(true);
        PricingStrategy normalPricing = new SeasonalPricing(false);

        try {
            // Book Deluxe room for Alice
            if (!r1.isAvailable()) {
                throw new RoomNotAvailableException("Room " + r1.roomNumber + " is not available!");
            }
            Reservation res1 = new Reservation(g1, r1, 3);
            System.out.println("Reservation done for " + g1.name);
            System.out.println("Bill: ₹" + res1.calculateBill(peakPricing));
            res1.checkout();

            // Book same Deluxe room for Bob (should be available after checkout)
            if (!r1.isAvailable()) {
                throw new RoomNotAvailableException("Room " + r1.roomNumber + " is not available!");
            }
            Reservation res2 = new Reservation(g2, r1, 2);
            System.out.println("Reservation done for " + g2.name);
            System.out.println("Bill: ₹" + res2.calculateBill(normalPricing));
            res2.checkout();

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
