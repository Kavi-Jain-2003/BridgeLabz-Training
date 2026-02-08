public class LibraryApp {

    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User u1 = UserFactory.createUser("student");
        User u2 = UserFactory.createUser("faculty");
        u1.role();
        u2.role();

        // Observer
        Observer s1 = new UserObserver("Amit");
        Observer s2 = new UserObserver("Neha");
        catalog.addObserver(s1);
        catalog.addObserver(s2);

        // Builder
        Book book = new BookBuilder("Data Structures")
                .setAuthor("Cormen")
                .setEdition("3rd")
                .build();

        catalog.addBook(book.getTitle());
    }
}
