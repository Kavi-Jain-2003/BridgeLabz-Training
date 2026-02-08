public class Book {

    String title;
    String author;
    String edition;

    // Constructor must be PUBLIC
    public Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
    }

    public String getTitle() {
        return title;
    }
}
