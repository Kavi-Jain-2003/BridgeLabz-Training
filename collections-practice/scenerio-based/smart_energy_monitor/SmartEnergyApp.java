import java.util.*;

public class SmartEnergyApp {

    public static void main(String[] args) {

        EnergyUsageService service = new EnergyUsageService();

        Calendar cal = Calendar.getInstance();

        try {
            cal.set(2025, Calendar.JANUARY, 10);
            service.addReading(cal.getTime(), 5.2);
            service.addReading(cal.getTime(), 3.8);

            cal.set(2025, Calendar.JANUARY, 11);
            service.addReading(cal.getTime(), 6.0);

            cal.set(2025, Calendar.FEBRUARY, 1);
            service.addReading(cal.getTime(), 4.5);

        } catch (InvalidEnergyReadingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(
            "Daily Average (Jan 10): " +
            service.calculateDailyAverage(cal.getTime())
        );

        System.out.println(
            "Monthly Average (Jan 2025): " +
            service.calculateMonthlyAverage(Calendar.JANUARY, 2025)
        );

        service.displayReport();
    }
}
