import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfoDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        try {
            Class<?> cls = Class.forName(className);

            // Display class name
            System.out.println("\nClass Name: " + cls.getName());

            // Display Constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }

            // Display Fields
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            // Display Methods
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }

        sc.close();
    }
}
