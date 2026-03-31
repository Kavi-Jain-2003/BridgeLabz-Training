import java.util.*;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void addBook(String bookName) {
        System.out.println("Book added: " + bookName);
        for (Observer o : observers) {
            o.update(bookName);
        }
    }
}
