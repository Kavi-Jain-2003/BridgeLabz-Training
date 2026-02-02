import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathOperations obj = new MathOperations();

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            // Get method dynamically
            Method method = obj.getClass().getMethod(methodName, int.class, int.class);

            // Invoke method
            int result = (int) method.invoke(obj, a, b);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Invalid method name!");
        }

        sc.close();
    }
}
