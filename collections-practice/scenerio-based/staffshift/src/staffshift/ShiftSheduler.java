package staffshift;

import java.util.*;

class ShiftScheduler {

    private List<Employee> employeeList = new ArrayList<>();

    // Map to assign shifts
    private Map<ShiftTime, List<Employee>> shiftMap = new HashMap<>();

    // HashSet to prevent duplicate assignment
    private Set<String> assignedSet = new HashSet<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void assignShift(Employee emp, ShiftTime shift)
            throws ShiftAlreadyAssignedException {

        String key = emp.getId() + "_" + shift;

        if (assignedSet.contains(key)) {
            throw new ShiftAlreadyAssignedException(
                    "Employee " + emp.getName() +
                    " already assigned to " + shift + " shift");
        }

        shiftMap.putIfAbsent(shift, new ArrayList<>());
        shiftMap.get(shift).add(emp);

        assignedSet.add(key);

        System.out.println(emp.getName() + " assigned to " + shift + " shift.");
    }

    public void displayShiftAssignments() {
        for (Map.Entry<ShiftTime, List<Employee>> entry : shiftMap.entrySet()) {
            System.out.println("\nShift: " + entry.getKey());
            for (Employee emp : entry.getValue()) {
                System.out.println(" - " + emp.getName());
            }
        }
    }
}
