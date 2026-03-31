package hotelreservationsystem;

public class SeasonalPricing implements PricingStrategy {

    private boolean peakSeason;

    public SeasonalPricing(boolean peakSeason) {
        this.peakSeason = peakSeason;
    }

    @Override
    public double calculatePrice(Room room, int nights) {
        if (peakSeason) {
            return room.basePrice * nights * 1.5; // 50% more in peak season
        } else {
            return room.basePrice * nights;
        }
    }
}
