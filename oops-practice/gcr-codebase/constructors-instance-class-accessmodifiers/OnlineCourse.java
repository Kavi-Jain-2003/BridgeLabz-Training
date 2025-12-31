//Online Course Management Design a Course class with: Instance Variables: courseName, duration, fee. Class Variable: instituteName (common for all courses). Methods: An instance method displayCourseDetails() to display the course details. A class method updateInstituteName() to modify the institute name for all courses.

public class OnlineCourse {
	// attributes
	String courseName;
	int fee;
	int duration;
	// class variable
	static String instituteName ="GLA University";

	// parametrized constructor
	OnlineCourse(String courseName, int fee, int duration) {
		this.courseName = courseName;
		this.fee = fee;
		this.duration=duration;
	}

	// instance method
	void displayCourseDetails() {
		System.out.println("Institue name:"+instituteName);
		System.out.println("courseName:" + courseName);
		System.out.println("fee:" + fee);
		System.out.println("duration:" + duration);
		System.out.println();
	}

	// class method static
	static void updateInstituteName(String newInstituteName) {
		instituteName=newInstituteName;
	}

	public static void main(String[] args) {
		OnlineCourse c1 = new OnlineCourse("Java Full Stack", 6, 60000);
        OnlineCourse c2 = new OnlineCourse("Python Data Science", 5, 55000);
		

		c1.displayCourseDetails();
		c2.displayCourseDetails();
		OnlineCourse.updateInstituteName("GL Bajaj");

		c1.displayCourseDetails();
		c2.displayCourseDetails();

	}
}
