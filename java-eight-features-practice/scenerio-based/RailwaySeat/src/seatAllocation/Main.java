package seatAllocation;

import java.util.*;

class Booking {
    String passengerId;
    int seatCount;
    double bookingFare;

    Booking(String passengerId, int seatCount, double bookingFare) {
        this.passengerId = passengerId;
        this.seatCount = seatCount;
        this.bookingFare = bookingFare;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public double getBookingFare() {
        return bookingFare;
    }

    public String getPassengerId() {
        return passengerId;
    }
}

class Train {
    String trainId;
    String source;
    String destination;
    int totalSeats;
    double baseFare;
    List<Booking> blist;

    Train(String trainId, String source, String destination, int totalSeats, double baseFare) {
        this.trainId = trainId;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.baseFare = baseFare;
        this.blist = new ArrayList<>();
    }

    public String getTrainId() {
        return trainId;
    }

    // calculate booked seats
    public int getBookedSeats() {
        int sum = 0;
        for (Booking b : blist) {
            sum += b.getSeatCount();
        }
        return sum;
    }

    public int getAvailableSeats() {
        return totalSeats - getBookedSeats();
    }

    public double getRevenue() {
        double sum = 0;
        for (Booking b : blist) {
            sum += b.getBookingFare();
        }
        return sum;
    }
}

class RailwayManager {
    static List<Train> tlist = new ArrayList<>();

    public static Train findTrain(String trainId) {
        for (Train t : tlist) {
            if (t.getTrainId().equals(trainId)) {
                return t;
            }
        }
        return null;
    }

    public static int addTrain(String trainId, String source, String destination, int totalSeats, double baseFare) {
        if (findTrain(trainId) == null) {
            tlist.add(new Train(trainId, source, destination, totalSeats, baseFare));
        }
        return 1;
    }

    public static void bookSeats(String trainId, String passengerId, int seatCount) {
        Train t = findTrain(trainId);

        if (t == null || seatCount > t.getAvailableSeats()) {
            System.out.println("Booking failed");
            return;
        }

        double fare = (seatCount * t.baseFare) + (seatCount * 25);

        t.blist.add(new Booking(passengerId, seatCount, fare));

        System.out.println("BOOKED " + trainId + " " + passengerId + " " + (int)fare);
    }

    public static void cancelBooking(String trainId, String passengerId) {
        Train t = findTrain(trainId);

        if (t == null) {
            System.out.println("Cancellation failed");
            return;
        }

        for (Booking b : t.blist) {
            if (b.getPassengerId().equals(passengerId)) {
                t.blist.remove(b);
                System.out.println("CANCELLED " + trainId + " " + passengerId);
                return;
            }
        }

        System.out.println("Cancellation failed");
    }

    public static void findRoute(String source, String destination) {
        boolean found = false;

        for (Train t : tlist) {
            if (t.source.equals(source) && t.destination.equals(destination)) {
                System.out.println(t.trainId + " " + t.getAvailableSeats());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No trains available");
        }
    }

    public static void summary() {
        boolean hasBooking = false;

        for (Train t : tlist) {
            if (!t.blist.isEmpty()) {
                hasBooking = true;
                break;
            }
        }

        if (!hasBooking) {
            System.out.println("No revenue generated");
            return;
        }

        for (Train t : tlist) {
            System.out.println(t.trainId + " " + (int)t.getRevenue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            String op = parts[0];

            if (op.equals("ADDTRAIN")) {
                RailwayManager.addTrain(parts[1], parts[2], parts[3],
                        Integer.parseInt(parts[4]), Double.parseDouble(parts[5]));
            }
            else if (op.equals("BOOK")) {
                RailwayManager.bookSeats(parts[1], parts[2],
                        Integer.parseInt(parts[3]));
            }
            else if (op.equals("CANCEL")) {
                RailwayManager.cancelBooking(parts[1], parts[2]);
            }
            else if (op.equals("ROUTE")) {
                RailwayManager.findRoute(parts[1], parts[2]);
            }
            else if (op.equals("SUMMARY")) {
                RailwayManager.summary();
            }
        }
    }
}
