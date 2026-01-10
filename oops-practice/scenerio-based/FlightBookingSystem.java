import java.util.ArrayList;
import java.util.List;

// Flight class
class Flight {
    String flightId;
    String source;
    String destination;
    int seats;

    Flight(String flightId, String source, String destination, int seats) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }
}

// Booking class
class Booking {
    String passengerName;
    String flightId;

    Booking(String passengerName, String flightId) {
        this.passengerName = passengerName;
        this.flightId = flightId;
    }
}

public class FlightBookingSystem {

    // Array to store flights
    static Flight[] flights = {
        new Flight("F101", "Delhi", "Mumbai", 3),
        new Flight("F102", "Delhi", "Bangalore", 2),
        new Flight("F103", "Mumbai", "Chennai", 4)
    };

    // List to store bookings
    static List<Booking> bookings = new ArrayList<>();

    // SEARCH flights (READ)
    static void searchFlight(String source, String destination) {
        boolean found = false;

        for (int i = 0; i < flights.length; i++) {
            if (flights[i].source.equalsIgnoreCase(source) &&
                flights[i].destination.equalsIgnoreCase(destination) &&
                flights[i].seats > 0) {

                System.out.println("Flight ID: " + flights[i].flightId);
                System.out.println("Seats Available: " + flights[i].seats);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found");
        }
    }

    // BOOK flight (CREATE + UPDATE)
    static void bookFlight(String name, String flightId) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].flightId.equalsIgnoreCase(flightId)) {

                if (flights[i].seats > 0) {
                    bookings.add(new Booking(name, flightId));
                    flights[i].seats--;   // UPDATE seats
                    System.out.println("Booking successful for " + name);
                } else {
                    System.out.println("No seats available");
                }
                return;
            }
        }
        System.out.println("Flight not found");
    }

    // VIEW bookings (READ)
    static void viewBookings() {
        if (bookings.size() == 0) {
            System.out.println("No bookings yet");
            return;
        }

        for (int i = 0; i < bookings.size(); i++) {
            System.out.println("Passenger Name: " + bookings.get(i).passengerName);
            System.out.println("Flight ID: " + bookings.get(i).flightId);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("Searching flights from Delhi to Mumbai");
        searchFlight("delhi", "mumbai");

        System.out.println("\nBooking flights");
        bookFlight("Pooja", "F101");
        bookFlight("Riya", "F101");

        System.out.println("\nBooking Details");
        viewBookings();

        System.out.println("\nSearch again after booking");
        searchFlight("DELHI", "MUMBAI");
    }
}
