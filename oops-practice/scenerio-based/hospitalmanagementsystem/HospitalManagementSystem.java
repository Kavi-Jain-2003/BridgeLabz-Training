package hospitalmanagementsystem;

public class HospitalManagementSystem implements HospitalService {

    private Patient[] patients = new Patient[5];
    private Doctor[] doctors = new Doctor[5];
    private Appointment[] appointments = new Appointment[10];

    private int patientCount = 0;
    private int doctorCount = 0;
    private int appointmentCount = 0;

    @Override
    public void registerPatient(Patient patient) {
        patients[patientCount++] = patient;
        System.out.println("Patient registered: " + patient.getName());
    }

    @Override
    public void registerDoctor(Doctor doctor) {
        doctors[doctorCount++] = doctor;
        System.out.println("Doctor registered: " + doctor.getName());
    }

    @Override
    public Appointment bookAppointment(Patient patient, Doctor doctor, String date)
            throws AppointmentNotAvailableException {

        // Check if doctor already has an appointment on that date
        for (int i = 0; i < appointmentCount; i++) {
            Appointment a = appointments[i];
            if (a.getStatus().equals("BOOKED") && a.getDoctor() == doctor && a.getDate().equals(date)) {
                throw new AppointmentNotAvailableException(
                        "Doctor " + doctor.getName() + " is not available on " + date);
            }
        }

        Appointment appointment = new Appointment(patient, doctor, date);
        appointments[appointmentCount++] = appointment;
        System.out.println("Appointment booked for patient: " + patient.getName());
        return appointment;
    }

    public static void main(String[] args) {

        HospitalManagementSystem hospital = new HospitalManagementSystem();

        // Register doctors
        Doctor d1 = new Doctor("D101", "Dr. Sharma", "Cardiology", 500);
        Doctor d2 = new Doctor("D102", "Dr. Mehta", "Orthopedics", 400);
        hospital.registerDoctor(d1);
        hospital.registerDoctor(d2);

        // Register patients
        Patient p1 = new Patient("P101", "Rahul");
        Patient p2 = new Patient("P102", "Sonia");
        hospital.registerPatient(p1);
        hospital.registerPatient(p2);

        try {
            Appointment a1 = hospital.bookAppointment(p1, d1, "2026-01-15");
            Appointment a2 = hospital.bookAppointment(p2, d1, "2026-01-15"); // ❌ Exception
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Book another appointment
        try {
            Appointment a3 = hospital.bookAppointment(p2, d2, "2026-01-16");
            a3.showAppointmentDetails();
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
