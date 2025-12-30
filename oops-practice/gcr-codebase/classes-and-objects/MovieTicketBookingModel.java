//Program to Model a Movie Ticket Booking System Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to: ● Book a ticket (assign seat and update price). ● Display ticket details.
// MovieTicket class
class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked; // Flag to track booking status

    // Constructor
    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.seatNumber = "";
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    // Method to display ticket details
    public void displayTicket() {
        if (isBooked) {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
        System.out.println("-------------------------------");
    }
}

// Main class
public class MovieTicketBookingModel {
    public static void main(String[] args) {
        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket("Dragon", 120.0);

        // Display before booking
        ticket.displayTicket();

        // Attempt booking
        ticket.bookTicket("A10");
        ticket.bookTicket("A11"); // Attempt to book again
        ticket.bookTicket("A12"); // Attempt to book again

        // Display after booking
        ticket.displayTicket();
    }
}
