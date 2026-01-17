
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfAWordInAFileUsingFileReader {
    public static void main(String[] args) {

        String filePath = "sample.txt";
        String targetWord = "Java";
        int count = 0;

        try {
            // Create FileReader and BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                // Check each word
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print result
        System.out.println("Occurrences of '" + targetWord + "': " + count);
    }
}
