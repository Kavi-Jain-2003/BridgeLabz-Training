import java.util.ArrayList;
import java.util.List;

// Abstract base class
abstract class CourseType {
    public abstract String getEvaluationMethod();
}

// Course types
class ExamCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Written Exam";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Assignments & Projects";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getEvaluationMethod() {
        return "Research Paper & Presentation";
    }
}

// Generic Course class
class Course<T extends CourseType> {

    private String courseName;
    private int credits;
    private T courseType;

    public Course(String courseName, int credits, T courseType) {
        this.courseName = courseName;
        this.credits = credits;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public T getCourseType() {
        return courseType;
    }
}

// Utility class using wildcard
class CourseUtil {

    public static void displayCourses(List<? extends CourseType> courseTypes) {
        for (CourseType course : courseTypes) {
            System.out.println(
                "Evaluation Method: " + course.getEvaluationMethod()
            );
        }
    }
}

// Main class
public class MultiLevelUniversityCourseManagementSystem {

    public static void main(String[] args) {

        ExamCourse exam = new ExamCourse();
        AssignmentCourse assignmentCourse = new AssignmentCourse();
        ResearchCourse research = new ResearchCourse();

        Course<ExamCourse> math =
                new Course<>("Mathematics", 4, exam);

        Course<AssignmentCourse> software =
                new Course<>("Software Engineering", 3, assignmentCourse);

        Course<ResearchCourse> ai =
                new Course<>("AI Research", 5, research);

        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(exam);
        courseTypes.add(assignmentCourse);
        courseTypes.add(research);

        System.out.println("---- Course Evaluation Methods ----");
        CourseUtil.displayCourses(courseTypes);
    }
}
