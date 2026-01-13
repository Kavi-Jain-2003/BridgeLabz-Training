package hospitalmanagementsystem;

public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String date;
    private String status;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.status = "BOOKED";
    }

    public void cancelAppointment() {
        status = "CANCELLED";
        System.out.println("Appointment cancelled for patient: " + patient.getName());
    }

    public void showAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
        System.out.println("Consultation Fee: ₹" + doctor.getConsultationFee());
    }

    public String getStatus() {
        return status;
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

}
