package studentcourseregistration;


public class Course {

    private String courseId;
    private String courseName;
    private String grade;

    public Course(String courseId, String courseName, String grade) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getGrade() {
        return grade;
    }
}
