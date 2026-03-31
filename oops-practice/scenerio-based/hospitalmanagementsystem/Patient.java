package hospitalmanagementsystem;

public class Patient extends Person {

    private String medicalHistory;

    public Patient(String id, String name) {
        super(id, name);
        this.medicalHistory = "";
    }

    public void addMedicalRecord(String record) {
        if (!medicalHistory.isEmpty()) {
            medicalHistory += ", ";
        }
        medicalHistory += record;
    }

    public String getMedicalHistory() {
        return medicalHistory.isEmpty() ? "No history" : medicalHistory;
    }
}
