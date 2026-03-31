import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo
{
	String task();
	String assignedTo();
	String priority() default "MEDIUM";
}
class ProjectTasks {

    @Todo(task = "Add login validation", assignedTo = "Jia", priority = "HIGH")
    public void loginFeature() {
    }

    @Todo(task = "Improve UI design", assignedTo = "Aman")
    public void uiFeature() {
    }

    @Todo(task = "Optimize database queries", assignedTo = "Riya", priority = "LOW")
    public void databaseFeature() {
    }
}


public class TodoDemo {
    public static void main(String[] args) {

        Method[] methods = ProjectTasks.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method Name : " + method.getName());
                System.out.println("Task        : " + todo.task());
                System.out.println("Assigned To : " + todo.assignedTo());
                System.out.println("Priority    : " + todo.priority());
                System.out.println("---------------------------");
            }
        }
    }
}
