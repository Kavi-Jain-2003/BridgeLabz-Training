package librarymanagementsystem;

public class StudentFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2; // ₹2 per day
    }
}
