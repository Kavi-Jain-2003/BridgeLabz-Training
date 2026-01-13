package librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Books
        Book b1 = new Book("B101", "Java Programming");
        Book b2 = new Book("B102", "DBMS Basics");

        // Members
        Member m1 = new Member("M101", "Rahul", "Student");
        Member m2 = new Member("M102", "Anita", "Staff");

        // Fine Calculators
        FineCalculator studentCalculator = new StudentFineCalculator();
        FineCalculator staffCalculator = new StaffFineCalculator();

        try {
            // Issue book b1 to Rahul
            if (!b1.isAvailable()) {
                throw new BookNotAvailableException(b1.getTitle() + " is not available");
            }
            b1.setAvailable(false);
            Transaction t1 = new Transaction(m1, b1); // constructor exists ✅
            System.out.println("Book issued: " + b1.getTitle() + " to " + m1.getName());

            // Return after 5 days late
            t1.returnBook(5); // method exists ✅
            double fine = studentCalculator.calculateFine(t1.getDaysLate());
            System.out.println("Fine for " + m1.getName() + ": ₹" + fine);

            // Issue book b1 again to Anita
            if (!b1.isAvailable()) {
                throw new BookNotAvailableException(b1.getTitle() + " is not available");
            }
            b1.setAvailable(false);
            Transaction t2 = new Transaction(m2, b1);
            System.out.println("Book issued: " + b1.getTitle() + " to " + m2.getName());

            // Return after 3 days late
            t2.returnBook(3);
            double fine2 = staffCalculator.calculateFine(t2.getDaysLate());
            System.out.println("Fine for " + m2.getName() + ": ₹" + fine2);

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
