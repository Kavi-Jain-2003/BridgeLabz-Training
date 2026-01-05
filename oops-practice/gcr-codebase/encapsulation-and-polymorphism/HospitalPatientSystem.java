import java.util.ArrayList;
import java.util.List;

// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Patient class
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalHistory; // Encapsulated sensitive data

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    // Getters (Encapsulation)
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    // Abstract method to calculate patient bill
    public abstract double calculateBill();

    // MedicalRecord interface methods
    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
        } else {
            for (String rec : medicalHistory) {
                System.out.println("- " + rec);
            }
        }
    }
}

// InPatient class
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRoomCharge = 1000;
    private double treatmentCost;

    InPatient(int patientId, String name, int age, int daysAdmitted, double treatmentCost) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted * dailyRoomCharge) + treatmentCost;
    }
}

// OutPatient class
class OutPatient extends Patient {
    private double consultationFee;
    private double medicineCost;

    OutPatient(int patientId, String name, int age, double consultationFee, double medicineCost) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicineCost;
    }
}

// Main class
public class HospitalPatientSystem {
    public static void main(String[] args) {

        // Polymorphism: Patient reference can point to InPatient or OutPatient
        Patient p1 = new InPatient(101, "Pooja", 30, 5, 2000);
        Patient p2 = new OutPatient(102, "Riya", 25, 500, 300);

        // Add medical records
        p1.addRecord("Admitted for surgery");
        p1.addRecord("Post-op medication prescribed");
        p2.addRecord("Routine checkup");
        p2.addRecord("Prescribed painkillers");

        // Display patient details, records, and billing
        System.out.println("InPatient Details:");
        p1.getPatientDetails();
        p1.viewRecords();
        System.out.println("Total Bill: " + p1.calculateBill() + "\n");

        System.out.println("OutPatient Details:");
        p2.getPatientDetails();
        p2.viewRecords();
        System.out.println("Total Bill: " + p2.calculateBill());
    }
}
