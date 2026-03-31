//movienode class
class MovieNode {
    String movieTitle;
    String director;
    int yearOfRelease;
    double ratingOutOFTen;
    MovieNode prev;
    MovieNode next;

    MovieNode(String movieTitle, String director, int yearOfRelease, double ratingOutOFTen) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.ratingOutOFTen = ratingOutOFTen;
        this.next=null;
    }
}

public class MovieManagementSystem {
    MovieNode head = null;
    MovieNode tail = null;

    // adding movie record AT end
    void addRecordAtEnd(String movieTitle, String director, int yearOfrelease, double ratingOutOfTen) {

        MovieNode mnode = new MovieNode(movieTitle, director, yearOfrelease, ratingOutOfTen);
        if (head == null) {
            head = tail = mnode;
            System.out.println("Record inserted successfully");
            return;
        }
        tail.next = mnode;
        mnode.prev = tail;
        tail = mnode;
    }

    // adding movie record AT beginning
    void addRecordAtBeginning(String movieTitle, String director, int yearOfrelease, double ratingOutOfTen) {
        MovieNode mnode = new MovieNode(movieTitle, director, yearOfrelease, ratingOutOfTen);
        if (head == null) {
            head = tail = mnode;
            return;
        }
        mnode.next = head;
        head.prev = mnode;
        head = mnode;

        System.out.println("Record inserted successfully");
    }

    // adding record at specific position
    void addRecordAtSpecificPosition(String movieTitle, String director, int yearOfrelease, double ratingOutOfTen,
            int position) {
        MovieNode mnode = new MovieNode(movieTitle, director, yearOfrelease, ratingOutOfTen);
        if (position == 1) {
            addRecordAtBeginning(movieTitle, director, yearOfrelease, ratingOutOfTen);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addRecordAtEnd(movieTitle, director, yearOfrelease, ratingOutOfTen);
            return;
        }
        mnode.prev = temp;
        mnode.next = temp.next;
        temp.next = mnode;
        temp.next.prev = mnode;
    }

    // remove record
    void remove(String movieTitle) {
        MovieNode temp = head;
        while (temp.next != null) {
            if (temp.next.movieTitle.equals(movieTitle)) {
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

                System.out.println("item removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // search movie by director name
    void searchMovieByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Movie found:" + temp.movieTitle);
                return;
            }
            temp = temp.next;
        }
    }

    // search moving by rating
    void searchMovieByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.ratingOutOFTen == rating) {
                System.out.println("Movie found:" + temp.movieTitle);
                return;
            }
            temp = temp.next;
        }
    }

    // update movie rating via title
    void update(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.movieTitle.equals(title)) {
                temp.ratingOutOFTen = newRating;
                System.out.println("rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("movie not found");
    }

    // displaying movie records
    void displayInForwardDirection() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("movie title:" + temp.movieTitle);
            System.out.println("movie director:" + temp.director);
            System.out.println("movie year of release:" + temp.yearOfRelease);
            System.out.println("movie ratings:" + temp.ratingOutOFTen);
            temp = temp.next;
        }

    }
//display in backward direction
    void displayInBackwardDirection() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println("movie title:" + temp.movieTitle);
            System.out.println("movie director:" + temp.director);
            System.out.println("movie year of release:" + temp.yearOfRelease);
            System.out.println("movie ratings:" + temp.ratingOutOFTen);
            temp = temp.prev;
        }

    }

    public static void main(String[] args) {
        MovieManagementSystem m = new MovieManagementSystem();
        m.addRecordAtBeginning("Dhurandhar", "A", 2025, 9);
        m.addRecordAtBeginning("Shershaah", "B", 2021, 9.5);
        m.addRecordAtSpecificPosition("Pardesh", "c", 2004, 10, 2);
        m.displayInForwardDirection();
        m.update("Dhurandhar", 9.3);
        m.searchMovieByDirector("D");
        m.remove("Pardesh");
        System.out.println("backward display:");
        m.displayInBackwardDirection();

    }

}
