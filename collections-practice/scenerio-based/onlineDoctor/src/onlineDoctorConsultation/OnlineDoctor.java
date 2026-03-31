package onlineDoctorConsultation;

import java.util.*;

//Custom Exception
class SlotUnavailableException extends Exception {
 public SlotUnavailableException(String message) {
     super(message);
 }
}

//Doctor Class (Encapsulation)
class Doctor {

 private String name;
 private String specialization;
 private List<String> availableSlots = new ArrayList<>();
 private List<String> bookedSlots = new ArrayList<>();
 private List<String> consultationHistory = new ArrayList<>();

 public Doctor(String name, String specialization) {
     this.name = name;
     this.specialization = specialization;
 }

 public String getName() {
     return name;
 }

 public String getSpecialization() {
     return specialization;
 }

 // Add available slot
 public void addSlot(String slot) {
     availableSlots.add(slot);
 }

 // Book appointment
 public void bookAppointment(String patientName, String slot)
         throws SlotUnavailableException {

     if (!availableSlots.contains(slot) || bookedSlots.contains(slot)) {
         throw new SlotUnavailableException("Slot not available!");
     }

     bookedSlots.add(slot);
     consultationHistory.add("Patient: " + patientName + " | Slot: " + slot);

     System.out.println("Appointment booked with Dr. " + name +
             " at " + slot);
 }

 public void showHistory() {
     System.out.println("Consultation History of Dr. " + name);
     for (String record : consultationHistory) {
         System.out.println(record);
     }
 }
}

//Main Class
public class OnlineDoctor {

 public static void main(String[] args) {

     // Map<Specialization, List<Doctor>>
     Map<String, List<Doctor>> doctorMap = new HashMap<>();

     Doctor d1 = new Doctor("Rahul", "Cardiologist");
     d1.addSlot("10AM");
     d1.addSlot("11AM");

     Doctor d2 = new Doctor("Priya", "Dermatologist");
     d2.addSlot("12PM");

     doctorMap.putIfAbsent("Cardiologist", new ArrayList<>());
     doctorMap.putIfAbsent("Dermatologist", new ArrayList<>());

     doctorMap.get("Cardiologist").add(d1);
     doctorMap.get("Dermatologist").add(d2);

     try {
         d1.bookAppointment("Aman", "10AM");
         d1.bookAppointment("Riya", "10AM"); // double booking (Exception)
     }
     catch (SlotUnavailableException e) {
         System.out.println(e.getMessage());
     }

     // Show history
     d1.showHistory();
 }
}
