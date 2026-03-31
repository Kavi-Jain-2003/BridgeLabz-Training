package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateCSVData {
    public static void main(String[] args) {

        String filePath = "users.csv";
        String line;

        // Regex patterns
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                if (!email.matches(emailRegex)) {
                    System.out.println("Invalid Email → ID: " + id + ", Name: " + name);
                    valid = false;
                }

                if (!phone.matches(phoneRegex)) {
                    System.out.println("Invalid Phone → ID: " + id + ", Name: " + name);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Row Data: " + line);
                    System.out.println("---------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}
