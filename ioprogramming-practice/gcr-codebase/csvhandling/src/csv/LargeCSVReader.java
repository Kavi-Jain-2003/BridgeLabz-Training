package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {
    public static void main(String[] args) {

        String filePath = "large_file.csv";
        int batchSize = 100;
        int totalCount = 0;
        String line;

        List<String> buffer = new ArrayList<>(batchSize);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header (optional)
            br.readLine();

            while ((line = br.readLine()) != null) {

                buffer.add(line);

                if (buffer.size() == batchSize) {
                    processBatch(buffer);
                    totalCount += buffer.size();
                    buffer.clear();

                    System.out.println("Records processed so far: " + totalCount);
                }
            }

            // Process remaining lines (less than 100)
            if (!buffer.isEmpty()) {
                processBatch(buffer);
                totalCount += buffer.size();
                buffer.clear();
            }

            System.out.println("Total records processed: " + totalCount);

        } catch (IOException e) {
            System.out.println("Error reading large CSV file");
        }
    }

    // Dummy processing method
    private static void processBatch(List<String> batch) {
        // Example: just iterate (real logic goes here)
        for (String record : batch) {
            // process record
        }
    }
}
