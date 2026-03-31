package studentcourseregistration;

public class Student extends Person {

    private Course[] courses = new Course[3];
    private int courseCount = 0;

    public Student(String id, String name) {
        super(id, name);
    }

    public void addCourse(Course course) throws CourseLimitExceededException {
        if (courseCount >= courses.length) {
            throw new CourseLimitExceededException("Maximum 3 courses allowed");
        }
        courses[courseCount++] = course;
        System.out.println("Enrolled in course: " + course.getCourseName());
    }

    public void dropCourse(String courseId) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseId().equals(courseId)) {
                courses[i] = courses[courseCount - 1];
                courses[courseCount - 1] = null;
                courseCount--;
                System.out.println("Course dropped successfully");
                return;
            }
        }
        System.out.println("Course not found");
    }

    public void viewGrades() {
        System.out.println("Grades for " + name + ":");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(
                courses[i].getCourseName() + " : " + courses[i].getGrade()
            );
        }
    }
}
