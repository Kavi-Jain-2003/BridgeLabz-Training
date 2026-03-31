import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}
class MyService {

    @ImportantMethod
    public void login() {
        System.out.println("Login method");
    }

    @ImportantMethod(level = "LOW")
    public void logout() {
        System.out.println("Logout method");
    }

    public void help() {
        System.out.println("Help method");
    }
}


public class ImportantMethodDemo {
    public static void main(String[] args) {

        Method[] methods = MyService.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Level: " + im.level());
                System.out.println();
            }
        }
    }
}
