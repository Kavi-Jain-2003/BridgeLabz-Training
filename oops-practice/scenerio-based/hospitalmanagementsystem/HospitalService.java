package hospitalmanagementsystem;

public interface HospitalService {

    void registerPatient(Patient patient);

    void registerDoctor(Doctor doctor);

    Appointment bookAppointment(Patient patient, Doctor doctor, String date)
            throws AppointmentNotAvailableException;
}
