import java.util.*;
import java.util.stream.*;
class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return name + " | " + specialty;
    }
}

public class HospitalAvailability {
	public static void main(String[] args)
	{
		 List<Doctor> doctors = Arrays.asList(
		            new Doctor("Dr. Sharma", "Cardiology", true),
		            new Doctor("Dr. Mehta", "Neurology", false),
		            new Doctor("Dr. Khan", "Orthopedics", true),
		            new Doctor("Dr. Verma", "Dermatology", true),
		            new Doctor("Dr. Rao", "Pediatrics", false)
		        );
		 List<Doctor> weekendDoctors=doctors.stream()
				 .filter(Doctor::isAvailableOnWeekend)
				 .sorted(Comparator.comparing(Doctor::getSpecialty))
				 .collect(Collectors.toList());
		 weekendDoctors.forEach(System.out::println);
	}
}
