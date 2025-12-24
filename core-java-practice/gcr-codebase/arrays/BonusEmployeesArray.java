//Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.

//importing scanner class
import java.util.Scanner;

public class BonusEmployeesArray {
	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		int size = 10;
		double[] salary = new double[size];
		double[] yearOfService = new double[size];
		double[] bonus = new double[size];
		double[] newSalary = new double[size];

		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;
		//taking input
		for (int i = 0; i < size; i++) {
			System.out.println("enter details for employee:" + (i + 1));
			System.out.println("enter salary:");
			salary[i] = input.nextDouble();
			System.out.println("enter yearOfService:");
			yearOfService[i] = input.nextDouble();
			if (salary[i] <= 0 || yearOfService[i] < 0) {
				System.out.println("invalid input");
				// decrement index to repeat input for same employee
				i--;
				continue;
			}
		}
		// calculating binus
		for (int i = 0; i < size; i++) {
			if (yearOfService[i] > 5) {
				bonus[i] = salary[i] * 0.05;
			} else {
				bonus[i] = salary[i] * 0.02;
			}
			newSalary[i] = salary[i] + bonus[i];
			totalBonus += bonus[i];
			totalOldSalary += salary[i];
			totalNewSalary += newSalary[i];
		}
		// output
		System.out.println("\n===== Zara Company Bonus Summary =====");
		for (int i = 0; i < size; i++) {
			System.out.println("Employee " + (i + 1) +
					" | Old Salary: " + salary[i] +
					" | Bonus: " + bonus[i] +
					" | New Salary: " + newSalary[i]);
		}
		System.out.println("\nTotal Old Salary: " + totalOldSalary);
		System.out.println("Total Bonus Payout: " + totalBonus);
		System.out.println("Total New Salary: " + totalNewSalary);

		// closing input
		input.close();
	}
}
