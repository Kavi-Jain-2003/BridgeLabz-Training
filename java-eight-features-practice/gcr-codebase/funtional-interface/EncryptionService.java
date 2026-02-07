interface SensitiveData {
    // Marker interface – no methods
}
class UserCredentials implements SensitiveData {

    private String username;
    private String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
class ProductInfo {

    private String productName;
    private double price;
}
public class EncryptionService {

    public static void encrypt(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: "
                    + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption required for: "
                    + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {

        UserCredentials user = new UserCredentials("admin", "secret123");
        ProductInfo product = new ProductInfo();

        encrypt(user);
        encrypt(product);
    }
}
