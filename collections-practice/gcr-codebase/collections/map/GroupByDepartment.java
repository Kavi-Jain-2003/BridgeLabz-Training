import java.util.*;
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class GroupByDepartment {

    public static void main(String[] args) {

        // Sample employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Map to group by department
        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {
            String dept = emp.department;

            // If department not in map, create new list
            if (!deptMap.containsKey(dept)) {
                deptMap.put(dept, new ArrayList<>());
            }

            // Add employee to list
            deptMap.get(dept).add(emp);
        }

        // Print grouped result
        for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
