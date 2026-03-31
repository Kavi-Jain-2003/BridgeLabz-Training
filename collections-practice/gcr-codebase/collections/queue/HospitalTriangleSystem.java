import java.util.PriorityQueue;
class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {

        // PriorityQueue: higher severity treated first
        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (p1, p2) -> p2.severity - p1.severity
        );

        // Adding patients
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        // Treat patients
        while (!pq.isEmpty()) {
            Patient p = pq.remove();
            System.out.println(p.name);
        }
    }
}
