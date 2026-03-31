public class User {
    private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return userId + " - " + name;
    }
}
