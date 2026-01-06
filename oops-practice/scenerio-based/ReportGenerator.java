import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom Exception
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

// Student class to store name, subjects, and marks
class Student {
    private String name;
    private String[] subjects;
    private int[] marks;

    Student(String name, String[] subjects, int[] marks) {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String determineGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }

    public void displayReportCard() {
        System.out.println("\n==============================");
        System.out.println("Report Card for: " + name);
        System.out.println("------------------------------");
        System.out.printf("%-15s %s\n", "Subject", "Marks");
        System.out.println("------------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-15s %d\n", subjects[i], marks[i]);
        }
        System.out.println("------------------------------");
        System.out.printf("Average: %.2f\n", calculateAverage());
        System.out.println("Grade: " + determineGrade());
        System.out.println("==============================");
    }
}

public class ReportGenerator {

    static Scanner sc = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter number of students:");
        int numStudents = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter number of subjects:");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[numSubjects];
        System.out.println("Enter names of subjects:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }

        // Input student data
        for (int s = 0; s < numStudents; s++) {
            System.out.println("\nEnter name of student " + (s + 1) + ":");
            String studentName = sc.nextLine();
            int[] marks = new int[numSubjects];

            for (int m = 0; m < numSubjects; m++) {
                while (true) {
                    try {
                        System.out.print("Enter marks for " + subjects[m] + ": ");
                        marks[m] = sc.nextInt();
                        if (marks[m] < 0 || marks[m] > 100) {
                            throw new InvalidMarkException("Marks must be between 0 and 100!");
                        }
                        break; // valid mark
                    } catch (InvalidMarkException e) {
                        System.out.println(e.getMessage() + " Try again.");
                    } catch (Exception e) {
                        System.out.println("Invalid input. Enter integer marks!");
                        sc.next(); // clear invalid input
                    }
                }
            }
            sc.nextLine(); // consume newline
            students.add(new Student(studentName, subjects, marks));
        }

        // Display report cards for all students
        System.out.println("\n\n===== All Student Report Cards =====");
        for (Student student : students) {
            student.displayReportCard();
        }

        sc.close();
    }
}
