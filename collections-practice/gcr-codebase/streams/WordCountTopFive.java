import java.io.*;
import java.util.*;

public class WordCountTopFive {

    public static void main(String[] args) {

        HashMap<String, Integer> wordCount = new HashMap<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Convert to lowercase and split words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (word.length() == 0)
                        continue;

                    // Count words
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }

            // Convert map to list
            List<Map.Entry<String, Integer>> list =
                    new ArrayList<>(wordCount.entrySet());

            // Sort by frequency (descending)
            Collections.sort(list, (a, b) ->
                    b.getValue() - a.getValue());

            // Display top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;

            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                count++;
                if (count == 5)
                    break;
            }

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error while closing file.");
            }
        }
    }
}
