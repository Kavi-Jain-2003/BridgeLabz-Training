//rogram to Simulate Student Report Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods: ● To calculate the grade based on the marks. ● To display the students details and grade.
// Student class
class Student {
    // Attributes
    String name;
    String rollNumber;
    double mark1, mark2, mark3;

    // Constructor to initialize student details
    public Student(String name, String rollNumber, double mark1, double mark2, double mark3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate grade based on average marks
    public String calculateGrade() {
        double average = (mark1 + mark2 + mark3) / 3;

        if (average >= 80)
            return "A";
        else if (average >= 70)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "D";
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + calculateGrade());
        System.out.println("-----------------------------");
    }
}

// Main class
public class SimulateStudentReport {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Thamarai", "ECE001", 80.0, 70.0, 75.0);
        Student student2 = new Student("Kannan", "CSC002", 60.0, 65.0, 50.0);

        // Displaying student reports
        student1.displayDetails();
        student2.displayDetails();
    }
}
