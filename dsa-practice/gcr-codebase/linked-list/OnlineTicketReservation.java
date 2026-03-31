//ticketnode class
class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName,
               String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class OnlineTicketReservation {

    TicketNode head = null;
    TicketNode tail = null;

    // Add ticket at end
    void addTicket(int id, String customer, String movie,
                   String seat, String time) {

        TicketNode newTicket =
            new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newTicket;
            newTicket.next = head;
            System.out.println("Ticket booked successfully");
            return;
        }

        tail.next = newTicket;
        newTicket.next = head;
        tail = newTicket;
        System.out.println("Ticket booked successfully");
    }

    // Remove ticket by ID
    void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        // Single node case
        if (head.ticketId == ticketId && head == tail) {
            head = tail = null;
            System.out.println("Ticket cancelled");
            return;
        }

        // Remove head
        if (head.ticketId == ticketId) {
            head = head.next;
            tail.next = head;
            System.out.println("Ticket cancelled");
            return;
        }

        TicketNode temp = head;
        do {
            if (temp.next.ticketId == ticketId) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                System.out.println("Ticket cancelled");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println(
                "ID: " + temp.ticketId +
                " | Customer: " + temp.customerName +
                " | Movie: " + temp.movieName +
                " | Seat: " + temp.seatNumber +
                " | Time: " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name
    void searchByCustomer(String name) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Ticket Found: " +
                        temp.ticketId + " | " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for customer");
    }

    // Search by Movie Name
    void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Ticket Found: " +
                        temp.ticketId + " | " + temp.customerName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for this movie");
    }

    // Count total tickets
    int totalTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {

        OnlineTicketReservation t = new OnlineTicketReservation();

        t.addTicket(101, "Kavi", "Inception", "A1", "10:30 AM");
        t.addTicket(102, "Riya", "Inception", "A2", "10:30 AM");
        t.addTicket(103, "Aman", "Avatar", "B1", "1:00 PM");

        t.displayTickets();

        t.searchByCustomer("Riya");
        t.searchByMovie("Inception");

        t.removeTicket(102);

        System.out.println("\nAfter Cancellation:");
        t.displayTickets();

        System.out.println("Total Tickets Booked: " + t.totalTickets());
    }
}
