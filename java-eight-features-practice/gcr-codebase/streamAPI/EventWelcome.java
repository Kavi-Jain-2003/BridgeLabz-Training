import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Aarav", "Neha", "Rohit", "Sneha"
        );

        attendees.stream()
            .forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
            );
    }
}
