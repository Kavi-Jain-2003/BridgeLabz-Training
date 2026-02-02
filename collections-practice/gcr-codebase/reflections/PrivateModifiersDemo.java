import java.lang.reflect.Field;
class Person
{
	private int age=20;
}
public class PrivateModifiersDemo  {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        // Get Class object
        Class<?> cls = p.getClass();

        // Access private field
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);   // allow access

        // Modify value
        field.set(p, 30);

        // Retrieve value
        int ageValue = (int) field.get(p);

        System.out.println("Age: " + ageValue);
    }
}
