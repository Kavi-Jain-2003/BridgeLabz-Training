package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {
    public static void main(String[] args) {

        String filePath = "students.csv";
        String line;

        Set<String> uniqueIDs = new HashSet<>();
        Set<String> duplicateIDs = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");
                String id = data[0];

                if (!uniqueIDs.add(id)) {
                    duplicateIDs.add(id);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }

        // Print duplicate records
        if (duplicateIDs.isEmpty()) {
            System.out.println("No duplicate records found.");
        } else {
            System.out.println("Duplicate IDs found: " + duplicateIDs);
            System.out.println("\nDuplicate Records:");

            // Re-read CSV to print full duplicate rows
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                br.readLine(); // skip header
                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;
                    String[] data = line.split(",");
                    if (duplicateIDs.contains(data[0])) {
                        System.out.println(line);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error reading CSV file");
            }
        }
    }
}
