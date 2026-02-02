import java.lang.reflect.Method;
class Calculator {

    private int multiply(int a, int b) {
        return a * b;
    }
}
public class ReflectionMethodDemo {
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        // Get Class object
        Class<?> cls = calc.getClass();

        // Get private method
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);   // allow access

        // Invoke method
        int result = (int) method.invoke(calc, 5, 4);

        System.out.println("Result: " + result);
    }
}

