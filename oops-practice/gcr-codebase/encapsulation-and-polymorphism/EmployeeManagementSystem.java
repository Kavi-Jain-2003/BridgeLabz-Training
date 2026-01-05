//EmployeeManagementSystem
//interface with abstract methods
interface Departments {
	public abstract void assignDepartment(String department);

	public abstract void getDepartmentDetails();
}
//abstract class implement the interface
abstract class Employee implements Departments {
	private int employeeId;
	private String name;
	protected double baseSalary;
	protected String department;

	Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	// getter
	public int getEmpId() {
		return employeeId;
	}

	public String getEmpName() {
		return name;
	}
	public double getSalary()
	{
		return baseSalary;
	}
	
	//abstract method

	abstract void calculateSalary();
	//concrete method

	public void displayDetails() {
		System.out.println("EmployeeId:" + getEmpId());
		System.out.println("Employee name:" + getEmpName());
		System.out.println("Base Salary:" + getSalary());
	}

	
}
//class extending abstract class
class FullTimeEmployee extends Employee {
	double workHours;
	double wagePerHour;

	FullTimeEmployee(int employeeId, String name, double workHours, double wagePerHour) {
		super(employeeId, name);
		this.workHours = workHours;
		this.wagePerHour = wagePerHour;
	}
//overriding abstarct class abstract method
	@Override
	void calculateSalary() {
		baseSalary = wagePerHour * workHours;
		// System.out.println("Slaary:"+baseSalary);
	}
//overidding interface mathod
//setter
	@Override
	public void assignDepartment(String dep) {
		department = dep;
	}
	//overidding interface mathod
	@Override
	public void getDepartmentDetails() {
		System.out.println("department:" + department);
	}
}

class PartTimeEmployee extends Employee {
		double workHours;
	double wagePerHour;

	PartTimeEmployee(int employeeId, String name, double workHours, double wagePerHour) {
		super(employeeId, name);
		this.workHours = workHours;
		this.wagePerHour = wagePerHour;
	}
//overriding abstarct class abstract method
	@Override
	void calculateSalary() {
		baseSalary = wagePerHour * workHours;
		// System.out.println("Slaary:"+baseSalary);
	}
//overidding interface mathod
	@Override
	public void assignDepartment(String dep) {
		department = dep;
	}
	//overidding interface mathod
	@Override
	public void getDepartmentDetails() {
		System.out.println("department:" + department);
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee f = new FullTimeEmployee(101,"Pooja", 8, 200);
		Employee p = new PartTimeEmployee(102, "Riya", 4, 100);
		f.assignDepartment("HR");
		p.assignDepartment("Sales");
		f.calculateSalary();
		p.calculateSalary();
		f.displayDetails();
		f.getDepartmentDetails();
		p.displayDetails();
		p.getDepartmentDetails();
	}
}
