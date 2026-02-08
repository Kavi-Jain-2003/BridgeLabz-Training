public class UserFactory {

    public static User createUser(String type) {

        if (type.equalsIgnoreCase("student"))
            return new Student();

        if (type.equalsIgnoreCase("faculty"))
            return new Faculty();

        if (type.equalsIgnoreCase("librarian"))
            return new Librarian();

        return null;
    }
}
