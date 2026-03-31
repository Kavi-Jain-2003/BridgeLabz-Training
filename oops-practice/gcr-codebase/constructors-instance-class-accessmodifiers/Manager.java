// Parent class
class EmployeeDetailsWithIDAndDepartment {

    // access modifiers
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    // constructor
    EmployeeDetailsWithIDAndDepartment(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public getter for salary
    public double getSalary() {
        return salary;
    }

    // public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }
}

// Child class
public class Manager extends EmployeeDetailsWithIDAndDepartment {

    String designation;

    // constructor
    Manager(int employeeID, String department, double salary, String designation) {
        super(employeeID, department, salary);
        this.designation = designation;
    }

    // method demonstrating access to public & protected members
    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);    // public
        System.out.println("Department: " + department);     // protected
        System.out.println("Salary: " + getSalary());         // private via getter
        System.out.println("Designation: " + designation);
        System.out.println();
    }

    public static void main(String[] args) {

        Manager mgr =
                new Manager(201, "IT", 75000, "Project Manager");

        mgr.displayManagerDetails();

        // modifying salary using public method
        mgr.setSalary(85000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
