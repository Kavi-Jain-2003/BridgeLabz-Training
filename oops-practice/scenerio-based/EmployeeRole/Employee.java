package EmployeeRole;

// Abstract class
abstract class Employee {

    private final String name;
    private final double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // getter for salary
    public double getSalary() {
        return salary;
    }

    // abstract method
    abstract double getBonus();
}
