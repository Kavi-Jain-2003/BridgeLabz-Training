public class LeaveRequest {
    private String employeeId;
    private int leaveDays;
    private String status; // PENDING, APPROVED, REJECTED

    public LeaveRequest(String employeeId, int leaveDays) {
        this.employeeId = employeeId;
        this.leaveDays = leaveDays;
        this.status = "PENDING";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void approve() {
        status = "APPROVED";
    }

    public void reject() {
        status = "REJECTED";
    }

    @Override
    public String toString() {
        return employeeId + " | Days: " + leaveDays + " | Status: " + status;
    }
}
