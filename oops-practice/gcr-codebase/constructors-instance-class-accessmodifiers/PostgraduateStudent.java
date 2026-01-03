// University Management System Create a Student class with: rollNumber (public). name (protected). CGPA (private). Write methods to: Access and modify CGPA using public methods. Create a subclass PostgraduateStudent to demonstrate the use of protected members.

class StudentWithDetails {
	// access modifiers
    public int rollNumber;      // public
    protected String name;      // protected
    private double cgpa;        // private


	// constructor
    StudentWithDetails(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

	 // public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

	// public setter for CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    // display method
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);	}
}
public class PostgraduateStudent extends StudentWithDetails {

    String specialization;

    // constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // method demonstrating protected member access
    void displayPGDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);               // protected
        System.out.println("CGPA: " + getCGPA());          // private via getter
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {

        PostgraduateStudent pg =
                new PostgraduateStudent(101, "Ravi", 8.5, "Computer Science");

        pg.displayPGDetails();

        // modifying CGPA using public method
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

