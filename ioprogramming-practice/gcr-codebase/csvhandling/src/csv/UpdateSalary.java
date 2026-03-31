package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateSalary {
    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";
        String line;

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Read and write header
            bw.write(br.readLine());
            bw.newLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
            }

            System.out.println("Salary updated successfully. New file created.");

        } catch (IOException e) {
            System.out.println("Error processing CSV file");
        }
    }
}
