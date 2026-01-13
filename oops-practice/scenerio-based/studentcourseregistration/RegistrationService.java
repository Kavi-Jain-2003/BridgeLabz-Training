package studentcourseregistration;

public interface RegistrationService {

    void registerStudent(Student student);

    void enrollCourse(Student student, Course course)
            throws CourseLimitExceededException;
}