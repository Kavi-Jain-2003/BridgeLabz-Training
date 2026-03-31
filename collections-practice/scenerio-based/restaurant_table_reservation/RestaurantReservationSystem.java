import java.util.*;
public class RestaurantReservationSystem {

    // Map of tables
    static Map<Integer, Table> tableMap = new HashMap<>();

    // List of reservations
    static List<Reservation> reservations = new ArrayList<>();

    // Reserve table method
    static void reserveTable(int tableNumber, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved at " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Table " + tableNumber + " reserved at " + timeSlot);
    }

    // Cancel reservation
    static void cancelReservation(int tableNumber, String timeSlot) {

        Iterator<Reservation> it = reservations.iterator();

        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                it.remove();
                System.out.println("Reservation cancelled for table " + tableNumber);
                return;
            }
        }
        System.out.println("No reservation found to cancel");
    }

    // Show available tables
    static void showAvailableTables(String timeSlot) {

        System.out.println("Available tables at " + timeSlot + ":");

        for (int tableNo : tableMap.keySet()) {
            boolean booked = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == tableNo && r.timeSlot.equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }

            if (!booked) {
                System.out.println("Table " + tableNo);
            }
        }
    }

    public static void main(String[] args) {

        // Add tables
        tableMap.put(1, new Table(1));
        tableMap.put(2, new Table(2));
        tableMap.put(3, new Table(3));

        try {
            reserveTable(1, "7-8 PM");
            reserveTable(2, "7-8 PM");
            reserveTable(1, "7-8 PM"); // double booking
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        showAvailableTables("7-8 PM");

        cancelReservation(2, "7-8 PM");

        showAvailableTables("7-8 PM");
    }
}