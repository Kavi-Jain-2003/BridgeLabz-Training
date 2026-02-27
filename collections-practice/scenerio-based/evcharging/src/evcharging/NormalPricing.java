package evcharging;
public class NormalPricing implements PricingStrategy {
	public double calculateBill(double units) {
	        return units * 10;   // ₹10 per unit
	    }
	}

