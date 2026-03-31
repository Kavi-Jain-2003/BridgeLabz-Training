package librarymanagementsystem;

public class StaffFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 1; // ₹1 per day
    }
}
