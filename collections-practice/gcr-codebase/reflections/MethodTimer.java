import java.lang.reflect.Method;

class SampleTasks {

    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            // small work
        }
    }

    public void slowTask() {
        for (int i = 0; i < 1000000; i++) {
            // heavy work
        }
    }
}
class SampleTask{

    public void fastTask() {
        for (int i = 0; i < 1000; i++) {
            // small work
        }
    }

    public void slowTask() {
        for (int i = 0; i < 1000000; i++) {
            // heavy work
        }
    }
}

public class MethodTimer {

    public static void main(String[] args) throws Exception {

        SampleTasks obj = new SampleTasks();

        // Get class information
        Class<?> clazz = obj.getClass();

        // Loop through all methods
        for (Method method : clazz.getDeclaredMethods()) {

            long startTime = System.nanoTime();

            // Invoke method dynamically
            method.invoke(obj);

            long endTime = System.nanoTime();

            long executionTime = endTime - startTime;

            System.out.println(
                method.getName() + " executed in " + executionTime + " ns"
            );
        }
    }
}
