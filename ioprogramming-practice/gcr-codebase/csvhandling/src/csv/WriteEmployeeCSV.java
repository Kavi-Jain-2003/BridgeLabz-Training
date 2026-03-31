package csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // Header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // Employee Records
            bw.write("101,Raj,IT,45000");
            bw.newLine();

            bw.write("102,Pooja,HR,40000");
            bw.newLine();

            bw.write("103,Amit,Finance,50000");
            bw.newLine();

            bw.write("104,Neha,Sales,42000");
            bw.newLine();

            bw.write("105,Karan,IT,48000");
            bw.newLine();

            System.out.println("Employee data written successfully to CSV file.");

        } catch (IOException e) {
            System.out.println("Error writing to CSV file");
        }
    }
}
