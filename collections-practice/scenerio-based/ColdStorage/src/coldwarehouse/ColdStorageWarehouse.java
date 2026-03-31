package coldwarehouse;

import java.util.*;

//Custom Exception
class SensorFailureException extends Exception {
 public SensorFailureException(String message) {
     super(message);
 }
}

//Temperature Log Class
class TemperatureLog {

 List<Double> readings = new ArrayList<>();

 // Add temperature reading
 public void addReading(double temp) throws SensorFailureException {

     // If sensor gives impossible value
     if (temp < -50 || temp > 100) {
         throw new SensorFailureException("Sensor Failure! Invalid Reading: " + temp);
     }

     readings.add(temp);
 }

 // Calculate daily average
 public double calculateAverage() {
     double sum = 0;
     for (double t : readings) {
         sum += t;
     }
     return readings.size() == 0 ? 0 : sum / readings.size();
 }

 // Alert if temperature exceeds safe range (2°C to 8°C)
 public void checkAlert() {
     for (double t : readings) {
         if (t < 2 || t > 8) {
             System.out.println("⚠ ALERT! Unsafe Temperature: " + t);
         }
     }
 }
}

//Main Class
public class ColdStorageWarehouse {

 public static void main(String[] args) {

     Map<String, TemperatureLog> rooms = new HashMap<>();

     TemperatureLog room1 = new TemperatureLog();

     try {
         room1.addReading(4.5);
         room1.addReading(6.0);
         room1.addReading(9.0);   // Alert
         room1.addReading(-60);   // Sensor failure
     }
     catch (SensorFailureException e) {
         System.out.println(e.getMessage());
     }

     rooms.put("RoomA", room1);

     // Display Data
     for (Map.Entry<String, TemperatureLog> entry : rooms.entrySet()) {

         System.out.println("\nRoom: " + entry.getKey());

         TemperatureLog log = entry.getValue();

         log.checkAlert();

         double avg = log.calculateAverage();
         System.out.println("Daily Average Temperature: " + avg);
     }
 }
}
