import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}
class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "pooja")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}


public class CustomAnnotationDemo {
    public static void main(String[] args) {

        try {
            TaskManager tm = new TaskManager();
            Method method = tm.getClass().getMethod("completeTask");

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
