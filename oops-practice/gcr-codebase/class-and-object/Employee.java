//Program to Display Employee Details Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
class EmployeeDetails {
    //attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    public EmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Main class
public class Employee {
    public static void main(String[] args) {
        // Creating Employee object
        EmployeeDetails emp = new EmployeeDetails("Rohan", 1, 500000);

        // Displaying employee details
        emp.displayDetails();
    }
}
