import java.lang.reflect.Field;

class Persons {

    private int id;
    private String name;
    private int age;

    public Persons(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class JsonUtil {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true);

            try {
                String name = field.getName();
                Object value = field.get(obj);

                json.append("\"").append(name).append("\": ");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}

public class JsonDemo {
    public static void main(String[] args) {

        Persons p = new Persons(1, "Kavi", 22);

        String json = JsonUtil.toJson(p);
        System.out.println(json);
    }
}
