
// EmployeeWageComputationProblem
//importing scanner class
import java.util.Scanner;

public class EmployeeWageComputationProblem {

	public static void main(String[] args) {

		// creating scanner object
		Scanner input = new Scanner(System.in);
		// Welcome to Employee Wage Computation Program
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHour = 8;
		int partTimeHour = 4;
		int totalWorkingHours = fullDayHour + partTimeHour;
		int employeeWorkingDay = (int) (Math.random() * 20) + 1;
		System.out.println(
				"Enter choice 1-ToCheckAttendance 2-CalculateDailyWage 3-Add partTime employee wages 4-wagesForAMonth 5-Wages within limit");
		int usecase = input.nextInt();
		switch (usecase) {
			case 1:
				checkAttendance();
				break;
			case 2:
				dailyEmployeeWage(fullDayHour);
				break;
			case 3:
				partTime(partTimeHour);
				break;
			case 4:
				wagesForAMonth(fullDayHour, partTimeHour, employeeWorkingDay);
				break;
			case 5:
				wagesWithCondition(fullDayHour, partTimeHour, employeeWorkingDay, totalWorkingHours);
				break;
			default:
				System.out.println("you entered an invalid choice");

		}
		// closing input
		input.close();
	}

	// usecase1
	public static void checkAttendance() {
		int attendance = (int) (Math.random() * 2);
		if (attendance == 0) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee is present");
		}
	}

	// usecase 2
	public static int dailyEmployeeWage(int fullDayHour) {
		int wagePerHour = 20;

		int dailyWage = wagePerHour * fullDayHour;
		System.out.println("Wages for=" + fullDayHour + " hour is:" + dailyWage);
		return dailyWage;

	}

	// usecase3
	public static int partTime(int partTimeHour) {

		int wagesPerHour = 20;
		int partTimeWages = partTimeHour * wagesPerHour;
		System.out.println("Wages for " + partTimeHour + " hour part time is:" + partTimeWages);
		return partTimeWages;

	}

	// usecase 5
	public static int wagesForAMonth(int fullDayHour, int partTimeHour, int employeeWorkingDay) {
		int dailyWage = dailyEmployeeWage(fullDayHour);
		int partTimeWages = partTime(partTimeHour);

		int wagesInMonth = (dailyWage + partTimeWages) * employeeWorkingDay;
		System.out.println("Wages for=" + employeeWorkingDay + " day is:" + wagesInMonth);
		return wagesInMonth;
	}

	// usecase6
	public static void wagesWithCondition(int fullDayHour, int partTimeHour, int employeeWorkingDay,
			int totalWorkingHours) {
		if (totalWorkingHours <= 100 && employeeWorkingDay <= 20) {
			System.out.println(
					"Wages for working within limit:" + wagesForAMonth(fullDayHour, partTimeHour, employeeWorkingDay));
		} else {
			System.out.println("working hours and days are extended from limit");
		}
	}

}
