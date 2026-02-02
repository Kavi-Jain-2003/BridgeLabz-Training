class Student {

    public Student() {
        System.out.println("Student object created");
    }
}

public class CreateObjectDemo {
    public static void main(String[] args) {

        try {
            // Load class dynamically
            Class<?> cls = Class.forName("Student");

            // Create object without using new keyword
            Object obj = cls.getDeclaredConstructor().newInstance();

            Student s = (Student) obj;   // type casting

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

