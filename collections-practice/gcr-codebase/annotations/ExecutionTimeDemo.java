import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            // small task
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++) {
            // bigger task
        }
    }
}


public class ExecutionTimeDemo {
    public static void main(String[] args) throws Exception {

        PerformanceTest obj = new PerformanceTest();
        Method[] methods = PerformanceTest.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();
                method.invoke(obj);   // call method
                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println("Method: " + method.getName());
                System.out.println("Execution Time: " + executionTime + " ns");
                System.out.println("---------------------------");
            }
        }
    }
}



