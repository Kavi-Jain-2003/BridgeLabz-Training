import java.util.*;

class BookShelfManager {

    // genre -> list of books
    private HashMap<String, LinkedList<BookNode>> shelf = new HashMap<>();

    // to avoid duplicate books
    private HashSet<String> bookSet = new HashSet<>();

    void addBook(String genre, String author) {

        String key = genre + "-" + author;

        if (bookSet.contains(key)) {
            System.out.println("Book already exists");
            return;
        }

        // if genre does not exist, create list
        if (!shelf.containsKey(genre)) {
            shelf.put(genre, new LinkedList<BookNode>());
        }

        shelf.get(genre).add(new BookNode(genre, author));
        bookSet.add(key);

        System.out.println("Book added successfully");
    }

    void deleteBook(String author) {

        for (String genre : shelf.keySet()) {
            LinkedList<BookNode> list = shelf.get(genre);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).author.equals(author)) {
                    bookSet.remove(list.get(i).genre + "-" + list.get(i).author);
                    list.remove(i);
                    System.out.println("Book removed successfully");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }

    void displayAllBooks() {

        if (shelf.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        for (String genre : shelf.keySet()) {
            System.out.println("Genre: " + genre);
            LinkedList<BookNode> list = shelf.get(genre);

            for (int i = 0; i < list.size(); i++) {
                System.out.println("  Author: " + list.get(i).author);
            }
        }
    }
}
