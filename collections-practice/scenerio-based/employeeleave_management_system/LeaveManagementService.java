import java.util.*;

public class LeaveManagementService {

    private Map<String, Employee> employeeMap = new HashMap<>();
    private List<LeaveRequest> leaveRequests = new ArrayList<>();

    // Add employee
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    // Apply leave
    public void applyLeave(String employeeId, int days)
            throws InsufficientLeaveBalanceException {

        Employee employee = employeeMap.get(employeeId);

        if (employee == null) {
            System.out.println("Employee not found");
            return;
        }

        if (employee.getLeaveBalance() < days) {
            throw new InsufficientLeaveBalanceException(
                "Not enough leave balance for employee " + employeeId
            );
        }

        leaveRequests.add(new LeaveRequest(employeeId, days));
    }

    // Approve leave
    public void approveLeave(LeaveRequest request) {
        Employee employee = employeeMap.get(request.getEmployeeId());
        employee.deductLeave(request.getLeaveDays());
        request.approve();
    }

    // Reject leave
    public void rejectLeave(LeaveRequest request) {
        request.reject();
    }

    // View all leave requests
    public void viewLeaveRequests() {
        for (LeaveRequest request : leaveRequests) {
            System.out.println(request);
        }
    }
}
