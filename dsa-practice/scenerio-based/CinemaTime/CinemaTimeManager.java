import java.util.ArrayList;
import java.util.List;

class CinemaTimeManager {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();

    /* Add movie */
    void addMovie(String title, String time) throws InvalidTimeFormatException {

        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }

        movieTitles.add(title);
        showTimes.add(time);

        System.out.println("Movie added successfully");
    }

    /* Search movie using keyword */
    void searchMovie(String keyword) {

        boolean found = false;

        for (int i = 0; i < movieTitles.size(); i++) {
            if (movieTitles.get(i).contains(keyword)) {
                System.out.println(
                        "Found: " + movieTitles.get(i) + " at " + showTimes.get(i)
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    /* Display all movies */
    void displayAllMovies() {

        if (movieTitles.isEmpty()) {
            System.out.println("No movies available");
            return;
        }

        for (int i = 0; i < movieTitles.size(); i++) {
            String details = movieTitles.get(i) + " | Show Time: " + showTimes.get(i);
            System.out.println(details);
        }
    }

    /* Convert list to array for report */
    void generateReport() {

        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("Printable Movie Report:");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " - " + timesArray[i]);
        }
    }

    /* Time validation (HH:MM) */
    private boolean isValidTime(String time) {

        if (!time.matches("\\d{2}:\\d{2}")) {
            return false;
        }

        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}
