//interface
interface IPayable {
    double calculateBill();
}

class Doctor {
    private String doctorName;
    private String doctorId;

    Doctor(String doctorName, String doctorId) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
    }

    // getters
    String getDoctorName() {
        return doctorName;
    }

    String getDoctorId() {
        return doctorId;
    }
}

// abstract class
abstract class Patient {
    protected String patientName;
    protected int patientAge;
    protected String patientId;
    protected Doctor doctor;

    Patient(String patientId, String patientName, int patientAge, Doctor doctor) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doctor = doctor;
    }

    abstract void displayInfo();

}

// class extending abstract class and implementing interface
class InPatient extends Patient implements IPayable {
    private double bedRate = 150;
    private int noOfDays;
    private String disease;

    InPatient(String patientId, String patientName, int patientAge, String disease, int noOfDays, Doctor doctor) {
        super(patientId, patientName, patientAge, doctor);
        this.disease = disease;
        this.noOfDays = noOfDays;
    }

    @Override
    // interface method
    public double calculateBill() {
        return bedRate * noOfDays;
    }

    @Override
    // abstract method overriding
    public void displayInfo() {
        System.out.println("Patient id:" + patientId);
        System.out.println("Patient Name:" + patientName);
        System.out.println("Patient Age:" + patientAge);
        System.out.println("Patient disease:" + disease);
        System.out.println("Patient admit days:" + noOfDays);
        System.out.println("Doctor Id:" + doctor.getDoctorId());
        System.out.println("Doctor name:" + doctor.getDoctorName());
        System.out.println("Bill amount:" + calculateBill());
    }

}

// class extending abstract class and implementing interface
class OutPatient extends Patient implements IPayable {
    private double consultationFee = 300;
    private String disease;

    OutPatient(String patientId, String patientName, int patientAge, String disease, Doctor doctor) {
        super(patientId, patientName, patientAge, doctor);
        this.disease = disease;
    }

    @Override
    // interface method overidding
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    // abstract emthod overidding
    public void displayInfo() {
        System.out.println("Patient id:" + patientId);
        System.out.println("Patient Name:" + patientName);
        System.out.println("Patient Age:" + patientAge);
        System.out.println("Patient disease:" + disease);
        System.out.println("Doctor Id:" + doctor.getDoctorId());
        System.out.println("Doctor name:" + doctor.getDoctorName());
        System.out.println("Bill amount:" + calculateBill());
    }

}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Jiya", "D202");
        Doctor d2 = new Doctor("Dr. Seema", "D201");

        Patient p1 = new InPatient("P101", "Pooja", 23, "Fever", 3, d1);
        System.out.println("--------------------");
        Patient p2 = new OutPatient("P102", "Siya", 24, "Thyroid", d2);

        p1.displayInfo();
        p2.displayInfo();

    }

}
