import java.util.*;

public class EnergyUsageService {

    // Date -> List of energy readings
    private Map<Date, List<Double>> energyData = new HashMap<>();

    // Add energy reading
    public void addReading(Date date, double reading)
            throws InvalidEnergyReadingException {

        if (reading < 0) {
            throw new InvalidEnergyReadingException(
                "Energy reading cannot be negative"
            );
        }

        List<Double> readings = energyData.get(date);

        if (readings == null) {
            readings = new ArrayList<>();
            energyData.put(date, readings);
        }

        readings.add(reading);
    }

    // Calculate daily average
    public double calculateDailyAverage(Date date) {

        List<Double> readings = energyData.get(date);

        if (readings == null || readings.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double r : readings) {
            sum += r;
        }

        return sum / readings.size();
    }

    // Calculate monthly average
    public double calculateMonthlyAverage(int month, int year) {

        double total = 0;
        int count = 0;

        Calendar cal = Calendar.getInstance();

        for (Map.Entry<Date, List<Double>> entry : energyData.entrySet()) {
            cal.setTime(entry.getKey());

            int entryMonth = cal.get(Calendar.MONTH);
            int entryYear = cal.get(Calendar.YEAR);

            if (entryMonth == month && entryYear == year) {
                for (double value : entry.getValue()) {
                    total += value;
                    count++;
                }
            }
        }

        return count == 0 ? 0.0 : total / count;
    }

    // Report energy usage
    public void displayReport() {
        for (Map.Entry<Date, List<Double>> entry : energyData.entrySet()) {
            System.out.println(
                "Date: " + entry.getKey() +
                " | Readings: " + entry.getValue()
            );
        }
    }
}
