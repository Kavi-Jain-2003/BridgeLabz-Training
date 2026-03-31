package csv;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {
    public static void main(String[] args) {

        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        Map<Integer, String> studentMap = new HashMap<>();
        String line;

        // Step 1: Read students1.csv and store ID -> Name,Age
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            br1.readLine(); // skip header

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String age = data[2];

                studentMap.put(id, name + "," + age);
            }

        } catch (IOException e) {
            System.out.println("Error reading students1.csv");
            return;
        }

        // Step 2: Read students2.csv and merge
        try (
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br2.readLine(); // skip header

            while ((line = br2.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String marks = data[1];
                String grade = data[2];

                if (studentMap.containsKey(id)) {
                    bw.write(id + "," + studentMap.get(id) + "," + marks + "," + grade);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully.");

        } catch (IOException e) {
            System.out.println("Error merging CSV files");
        }
    }
}
