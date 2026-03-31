package staffshift;

public class Main {
    public static void main(String[] args) {

        ShiftScheduler scheduler = new ShiftScheduler();

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Priya");
        Employee e3 = new Employee(3, "Aman");

        scheduler.addEmployee(e1);
        scheduler.addEmployee(e2);
        scheduler.addEmployee(e3);

        try {
            scheduler.assignShift(e1, ShiftTime.MORNING);
            scheduler.assignShift(e2, ShiftTime.MORNING);
            scheduler.assignShift(e3, ShiftTime.NIGHT);

            // Duplicate assignment (Exception)
            scheduler.assignShift(e1, ShiftTime.MORNING);

        } catch (ShiftAlreadyAssignedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scheduler.displayShiftAssignments();
    }
}
