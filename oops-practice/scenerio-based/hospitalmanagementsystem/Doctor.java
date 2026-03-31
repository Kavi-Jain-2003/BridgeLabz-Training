package hospitalmanagementsystem;

public class Doctor extends Person {

    private String specialty;
    private double consultationFee;

    public Doctor(String id, String name, String specialty, double consultationFee) {
        super(id, name);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public String getSpecialty() {
        return specialty;
    }
}
