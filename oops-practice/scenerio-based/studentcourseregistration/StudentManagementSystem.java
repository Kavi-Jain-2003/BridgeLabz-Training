package studentcourseregistration;

public class StudentManagementSystem implements RegistrationService {

    @Override
    public void registerStudent(Student student) {
        System.out.println("Student registered: " + student.name);
    }

    @Override
    public void enrollCourse(Student student, Course course)
            throws CourseLimitExceededException {
        student.addCourse(course);
    }

    public static void main(String[] args) {

        StudentManagementSystem system = new StudentManagementSystem();

        Student student = new Student("S101", "Rahul");
        system.registerStudent(student);

        Course c1 = new Course("C1", "Java", "A");
        Course c2 = new Course("C2", "DBMS", "B");
        Course c3 = new Course("C3", "OS", "A");
        Course c4 = new Course("C4", "CN", "A");

        try {
            system.enrollCourse(student, c1);
            system.enrollCourse(student, c2);
            system.enrollCourse(student, c3);
            system.enrollCourse(student, c4); 
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        student.viewGrades();
        student.dropCourse("C2");
        student.viewGrades();
    }
}
