// EmployeeWageComputationProblem

public class EmployeeWageComputationProblemTwo {
	public static final int IS_ABSENT = 0;
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static final int WAGE_PER_HOUR = 20;
	public static final int PART_TIME_HOURS = 4;
	public static final int FULL_TIME_HOURS = 8;

	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HOURS = 100;

	public static void main(String[] args) {
		calculateTotalWageForMonth();
	}

	static int checkAttendance() {
		return (int) (Math.random() * 3);
	}

	static int getWorkingHours(int empStatus) {
		switch (empStatus) {
			case IS_PART_TIME:
				return PART_TIME_HOURS;
			case IS_FULL_TIME:
				return FULL_TIME_HOURS;
			default:
				return 0;
		}
	}

	static int calculateDailyWage(int hoursWorked) {
		return hoursWorked * WAGE_PER_HOUR;
	}

	static void calculateTotalWageForMonth() {
		int totalHours = 0;
		int totalWage = 0;
		for (int day = 1; totalHours < MAX_WORKING_HOURS&& day <= MAX_WORKING_DAYS; day++) {
			int empStatus = checkAttendance();
			int workingHours = getWorkingHours(empStatus);
			if (totalHours + workingHours > MAX_WORKING_HOURS) {
				workingHours = MAX_WORKING_HOURS - totalHours;
			}
			int dailyWage = calculateDailyWage(workingHours);
			totalHours += workingHours;
			totalWage += dailyWage;
			String status = "";
			if (workingHours == 8) {
				status = "FULL TIME";
			} else if (workingHours == 4) {
				status = "PART TIME";
			} else {
				status = "Absent";
			}
			System.out.println(
					"Day " + day +
							" : " + status +
							" | Hours = " + workingHours +
							" | Daily Wage = " + dailyWage +
							" | Total Wage = " + totalWage);
		}
		System.out.println("Final Total Hours Worked = " + totalHours);
		System.out.println("Final Total Wage = " + totalWage);
	}
}