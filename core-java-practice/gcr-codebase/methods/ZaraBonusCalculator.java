//Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.

//importing scanner class
import java.util.Random;

public class ZaraBonusCalculator {
	public static void main(String[] args) {
		int numEmployees = 10;

        // Generate salary and years of service
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonuses and new salaries
        double[][] salaryData = calculateBonusAndNewSalary(employeeData);

        // Display the report
        displayEmployeeBonusReport(employeeData, salaryData);
        
	}

	  // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            // 5-digit salary: 10000 to 99999
            data[i][0] = 10000 + rand.nextInt(90000);
            // Years of service: 1 to 10
            data[i][1] = 1 + rand.nextInt(10);
        }

        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }

        return result;
    }

    // Method to calculate totals and display in tabular format
    public static void displayEmployeeBonusReport(int[][] employeeData, double[][] salaryData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = salaryData[i][1];
            double newSalary = salaryData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d\t%.2f\t\t%d\t%.2f\t%.2f\n", i+1, (double)oldSalary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

}