interface BackupSerializable {
    // Marker interface – no methods
}
class UserData implements BackupSerializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
}
class TemporaryCache {

    private String cacheData;
}
public class BackupService {

    public static void backup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " +
                    obj.getClass().getSimpleName());
        } else {
            System.out.println("Backup NOT allowed for: " +
                    obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {

        UserData user = new UserData("pooja", "pooja@email.com");
        TemporaryCache cache = new TemporaryCache();

        backup(user);
        backup(cache);
    }
}
