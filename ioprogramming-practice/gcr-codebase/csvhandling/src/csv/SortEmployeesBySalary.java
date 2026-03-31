package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SortEmployeesBySalary {
    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> employees = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
            return;
        }

        // Sort by salary in descending order
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.salary, e1.salary);
            }
        });

        // Print top 5 highest-paid employees
        System.out.println("Top 5 Highest-Paid Employees:\n");

        int limit = Math.min(5, employees.size());

        for (int i = 0; i < limit; i++) {
            Employee e = employees.get(i);
            System.out.println("ID         : " + e.id);
            System.out.println("Name       : " + e.name);
            System.out.println("Department : " + e.department);
            System.out.println("Salary     : " + e.salary);
            System.out.println("-------------------------");
        }
    }
}
