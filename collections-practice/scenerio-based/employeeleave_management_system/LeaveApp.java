public class LeaveApp {

    public static void main(String[] args) {

        LeaveManagementService service = new LeaveManagementService();

        service.addEmployee(new Employee("E101", "Amit", 10));
        service.addEmployee(new Employee("E102", "Neha", 5));

        try {
            service.applyLeave("E101", 4);
            service.applyLeave("E102", 6); // Exception case
        } catch (InsufficientLeaveBalanceException e) {
            System.out.println(e.getMessage());
        }

        service.viewLeaveRequests();
    }
}
