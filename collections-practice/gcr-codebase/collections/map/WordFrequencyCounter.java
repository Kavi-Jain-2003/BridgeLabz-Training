import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt")
            );

            String line;

            while ((line = br.readLine()) != null) {

                // Convert to lowercase
                line = line.toLowerCase();

                // Remove punctuation
                line = line.replaceAll("[^a-z ]", "");

                // Split into words
                String[] words = line.split("\\s+");

                // Count frequency
                for (String word : words) {
                    if (word.isEmpty()) continue;

                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File not found!");
        }

        System.out.println(map);
    }
}
