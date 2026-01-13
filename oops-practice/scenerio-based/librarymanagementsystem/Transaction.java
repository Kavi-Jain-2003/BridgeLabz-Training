package librarymanagementsystem;

public class Transaction {

    private Member member;
    private Book book;
    private int daysLate; // number of days book returned late

    // Constructor
    public Transaction(Member member, Book book) {
        this.member = member;
        this.book = book;
        this.daysLate = 0;
    }

    // Method to return book and record late days
    public void returnBook(int daysLate) {
        this.daysLate = daysLate;
        book.setAvailable(true); // make book available again
        System.out.println("Book returned: " + book.getTitle() + " by " + member.getName());
    }

    // Getters
    public int getDaysLate() {
        return daysLate;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }
}
