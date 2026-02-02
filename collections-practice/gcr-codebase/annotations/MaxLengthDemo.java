import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}


class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        // Validate username length
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength != null && username.length() > maxLength.value()) {
                throw new IllegalArgumentException(
                    "Username length should not exceed " + maxLength.value()
                );
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

public class MaxLengthDemo {
    public static void main(String[] args) {

        User u1 = new User("POOJA");          // Valid
        System.out.println(u1.getUsername());

        User u2 = new User("VeryLongUserName"); // Exception
    }
}
