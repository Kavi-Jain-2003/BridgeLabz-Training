package csv;

import java.sql.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExportEmployeeToCSV {
    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "your_password";
        String csvFilePath = "employees_report.csv";

        String sql = "SELECT id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath))) {

            // Write CSV header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write data rows
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                String row = id + "," + name + "," + dept + "," + salary;
                bw.write(row);
                bw.newLine();
            }

            System.out.println("CSV report generated successfully at: " + csvFilePath);

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
