import java.io.*;
import java.util.ArrayList;

// Employee class
class Employee implements Serializable {

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

// Main class
public class EmployeeSerialization {

    public static void main(String[] args) {

        // Create employee list
        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Amit", "IT", 50000));
        empList.add(new Employee(2, "Neha", "HR", 45000));
        empList.add(new Employee(3, "Rahul", "Finance", 55000));

        // -------- Serialization --------
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("employees.dat"));

            oos.writeObject(empList);
            oos.close();

            System.out.println("Employees saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while saving employees.");
        }

        // -------- Deserialization --------
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employees.dat"));

            ArrayList<Employee> list =
                    (ArrayList<Employee>) ois.readObject();

            ois.close();

            System.out.println("\nEmployee Details:");
            for (Employee e : list) {
                System.out.println(
                        e.id + "  " + e.name + "  " +
                        e.department + "  " + e.salary
                );
            }

        } catch (IOException e) {
            System.out.println("Error while reading employees.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
