package smartTrafficFine;
import java.util.*;

//Custom Exception
class InvalidVehicleException extends Exception {
 public InvalidVehicleException(String message) {
     super(message);
 }
}

//Base Violation Class
class Violation {

 String type;
 int baseFine;

 public Violation(String type, int baseFine) {
     this.type = type;
     this.baseFine = baseFine;
 }

 public int calculateFine(int previousViolations) {
     return baseFine;  // Normal case
 }
}

//Polymorphism: Repeat Offender
class RepeatOffenderViolation extends Violation {

 public RepeatOffenderViolation(String type, int baseFine) {
     super(type, baseFine);
 }

 @Override
 public int calculateFine(int previousViolations) {
     if (previousViolations >= 2) {
         return baseFine + 500;  // Extra penalty
     }
     return baseFine;
 }
}

//Main System
public class SmartTrafficFineCollection {

 // Store vehicle → list of violations
 static Map<String, List<Violation>> violationMap = new HashMap<>();

 public static void main(String[] args) {

     try {
         addViolation("MH12AB1234", "Signal Jump", 1000);
         addViolation("MH12AB1234", "No Helmet", 500);
         addViolation("MH12AB1234", "Wrong Parking", 800); // repeat offender

         addViolation("DL01XY9999", "Overspeeding", 1500);

         generateMonthlyReport();

     } catch (InvalidVehicleException e) {
         System.out.println(e.getMessage());
     }
 }

 // Add Violation
 public static void addViolation(String vehicleNo, String type, int fine)
         throws InvalidVehicleException {

     if (vehicleNo == null || vehicleNo.length() < 5) {
         throw new InvalidVehicleException("Invalid Vehicle Number");
     }

     violationMap.putIfAbsent(vehicleNo, new ArrayList<>());

     int previousViolations = violationMap.get(vehicleNo).size();

     Violation violation =
             new RepeatOffenderViolation(type, fine);

     violationMap.get(vehicleNo).add(violation);

     int totalFine = violation.calculateFine(previousViolations);

     System.out.println("Vehicle: " + vehicleNo +
             " | Violation: " + type +
             " | Fine: " + totalFine);
 }

 // Monthly Report
 public static void generateMonthlyReport() {

     System.out.println("\n===== Monthly Report =====");

     for (String vehicle : violationMap.keySet()) {

         int total = 0;
         List<Violation> list = violationMap.get(vehicle);

         for (int i = 0; i < list.size(); i++) {
             total += list.get(i).calculateFine(i);
         }

         System.out.println("Vehicle: " + vehicle +
                 " | Total Violations: " + list.size() +
                 " | Total Fine: " + total);
     }
 }
}
