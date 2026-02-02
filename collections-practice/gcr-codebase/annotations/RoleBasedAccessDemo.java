import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)   // class-level
@interface RoleAllowed {
    String value();
}
@RoleAllowed("ADMIN")
class AdminService {

    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }
}

public class RoleBasedAccessDemo {

    // Simulated current user role
    static String currentUserRole = "USER";   // try ADMIN also

    public static void main(String[] args) {

        AdminService service = new AdminService();

        Class<?> cls = service.getClass();

        if (cls.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);

            if (currentUserRole.equals(roleAllowed.value())) {
                service.deleteUser();   // allowed
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
