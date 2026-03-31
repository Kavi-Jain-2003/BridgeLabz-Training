package evcharging;

public class PeakHourPricing implements PricingStrategy {

    @Override
    public double calculateBill(double units) {
        return units * 15;   // ₹15 per unit
    }
}