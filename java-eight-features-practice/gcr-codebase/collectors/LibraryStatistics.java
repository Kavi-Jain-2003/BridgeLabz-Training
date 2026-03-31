
import java.util.*;
import java.util.stream.*;
class Book {
    String title;
    String genre;
    int pages;

    Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}


public class LibraryStatistics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book("Java Basics", "Education", 450),
            new Book("Spring in Action", "Education", 550),
            new Book("Harry Potter", "Fantasy", 350),
            new Book("Lord of the Rings", "Fantasy", 900),
            new Book("Atomic Habits", "Self-Help", 320)
        );
        Map<String,IntSummaryStatistics> statsByGenre=books.stream()
        		.collect(Collectors.groupingBy(Book::getGenre,
        		Collectors.summarizingInt(Book::getPages)));
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}