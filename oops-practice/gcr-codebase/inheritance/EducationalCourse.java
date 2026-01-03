//Educational Course heirarchy
class Course // super class
{
    protected String courseName;
    protected int duration;
    //parametrized constuctor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// subclass
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;
    //parametrized constuctor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    //parametrized constuctor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
            double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayDetails() {
        System.out.println("Course name: " + courseName);
        System.out.println("Course duration: " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("is recorded?:" + isRecorded);
        System.out.println("fee:" + fee);
        System.out.println("discount:" + discount);

    }
    public double feeAfterDiscount(double fee, double discount) {
        return fee - (fee * discount / 100);
    }
}

public class EducationalCourse {

    public static void main(String[] args) {
        // accessing methods via child class object
        PaidOnlineCourse p1 = new PaidOnlineCourse("MBA", 2, "Online", true, 100000, 5);
        p1.displayDetails();
        System.out.println("fees after discount:" + p1.feeAfterDiscount(100000,5));
        System.out.println("---------------------------");
        PaidOnlineCourse p2 = new PaidOnlineCourse("MCA", 2, "Offline", false, 120000, 7);
        p2.displayDetails();
        System.out.println("fees after discount:" + p2.feeAfterDiscount(10000,7));
        
    }
}