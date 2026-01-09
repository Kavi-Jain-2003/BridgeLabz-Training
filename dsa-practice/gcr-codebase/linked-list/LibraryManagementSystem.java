//booknode class
class BookNode {
    String title;
    String author;
    int bookId;
    String genre;
    boolean availabilityStatus;
    BookNode prev;
    BookNode next;

    BookNode(String title, String author, int bookId, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
        this.next=null;
    }
}

public class LibraryManagementSystem {
    BookNode head = null;
    BookNode tail = null;

    // adding Book AT end
    void addBookAtEnd(String title, String author, int bookId, String genre, boolean availabilityStatus) {

        BookNode bnode = new BookNode(title, author, bookId, genre, availabilityStatus);
        if (head == null) {
            head = tail = bnode;
            System.out.println("Book inserted successfully");
            return;
        }
        tail.next = bnode;
        bnode.prev = tail;
        tail = bnode;
    }

    // adding Book AT beginning
    void addBookAtBeginning(String title, String author, int bookId, String genre, boolean availabilityStatus) {
        BookNode bnode = new BookNode(title, author, bookId, genre, availabilityStatus);
        if (head == null) {
            head = tail = bnode;
            return;
        }
        bnode.next = head;
        head.prev = bnode;
        head = bnode;

        System.out.println("Book inserted successfully");
    }

    // adding Book at specific position
    void addBookAtSpecificPosition(String title, String author, int bookId, String genre, boolean availabilityStatus,
            int position) {
        BookNode bnode = new BookNode(title, author, bookId, genre, availabilityStatus);
        if (position == 1) {
            addBookAtBeginning(title, author, bookId, genre, availabilityStatus);
            return;
        }
        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp == tail) {
            addBookAtEnd(title, author, bookId, genre, availabilityStatus);
            return;
        }
        bnode.prev = temp;
        bnode.next = temp.next;
        temp.next = bnode;
        temp.next.prev = bnode;
    }

    // remove boooks
    void remove(String title) {
        BookNode temp = head;
        while (temp.next != null) {
            if (temp.next.title.equals(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("book removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by title
    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println("Book found: " + temp.title + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by author
    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println("Book found: " + temp.title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // update rating via title
    void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.availabilityStatus = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" not found");
    }

    // displaying Books
    void displayInForwardDirection() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println("title:" + temp.title);
            System.out.println("author:" + temp.author);
            System.out.println("Book Id:" + temp.bookId);
            System.out.println("genre:" + temp.genre);
            System.out.println("is book available:" + temp.availabilityStatus);
            temp = temp.next;
        }

    }

    // display in reverse direction
    void displayInBackwardDirection() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println("title:" + temp.title);
            System.out.println("author:" + temp.author);
            System.out.println("Book Id:" + temp.bookId);
            System.out.println("genre:" + temp.genre);
            System.out.println("is book available:" + temp.availabilityStatus);
            temp = temp.next;
        }
    }

    // counting books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books:" + count);
    }

    public static void main(String[] args) {
        LibraryManagementSystem l = new LibraryManagementSystem();
        l.addBookAtBeginning("Java Basics", "James", 101, "Programming", true);
        l.addBookAtEnd("DSA", "Mark", 102, "CS", true);
        l.addBookAtSpecificPosition("DBMS", "Elmasri", 103, "Database", false, 2);

        l.displayInForwardDirection();
        l.searchByAuthor("Mark");
        l.updateAvailability(103, true);
        l.countBooks();

        System.out.println("Reverse Order:");
        l.displayInBackwardDirection();

    }

}
