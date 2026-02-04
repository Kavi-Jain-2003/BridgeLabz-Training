import java.util.*;
class Patient {
    int id;
    String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name;
    }
}



public class PatientIDPrinting {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(101, "Alice"));
        patients.add(new Patient(102, "Bob"));
        patients.add(new Patient(103, "Charlie"));
        patients.add(new Patient(104, "Diana"));

        System.out.println("All Patient IDs:");

        // Using method reference to print each patient ID
        patients.stream()
                .map(Patient::getId)      // method reference to getId()
                .forEach(System.out::println); // method reference to println()
    }
}

