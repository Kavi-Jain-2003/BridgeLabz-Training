import java.lang.reflect.Field;
class Configuration {

    private static String API_KEY = "OLD_KEY";
}



public class StaticFieldReflectionDemo {
    public static void main(String[] args) throws Exception {

        // Get Class object
        Class<?> cls = Configuration.class;

        // Access private static field
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);   // allow access

        // Modify static field (pass null)
        field.set(null, "NEW_SECRET_KEY");

        // Retrieve value
        String value = (String) field.get(null);

        System.out.println("API_KEY: " + value);
    }
}
