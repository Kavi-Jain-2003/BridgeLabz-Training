import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import java.lang.reflect.Method;

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}
class BugTracker {

    @BugReport(description = "Null pointer exception issue")
    @BugReport(description = "Performance issue on large input")
    public void processData() {
        System.out.println("Processing data...");
    }
}


public class RepeatableAnnotationDemo {
    public static void main(String[] args) throws Exception {

        Method method = BugTracker.class.getMethod("processData");

        BugReport[] bugs = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugs) {
            System.out.println("Bug Description: " + bug.description());
        }
    }
}

