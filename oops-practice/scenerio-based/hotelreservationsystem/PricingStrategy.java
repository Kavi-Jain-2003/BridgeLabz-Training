package hotelreservationsystem;

public interface PricingStrategy {
    double calculatePrice(Room room, int nights);
}
