package railwayPlatform;

import java.util.*;

//Custom Exception
class PlatformUnavailableException extends Exception {
 public PlatformUnavailableException(String message) {
     super(message);
 }
}

//Train Class (Comparable for PriorityQueue)
class Train implements Comparable<Train> {

 String trainName;
 int arrivalTime; // simple integer (e.g., 1000 = 10:00)

 public Train(String trainName, int arrivalTime) {
     this.trainName = trainName;
     this.arrivalTime = arrivalTime;
 }

 // Sort by arrival time (earliest first)
 @Override
 public int compareTo(Train other) {
     return this.arrivalTime - other.arrivalTime;
 }
}

//Platform Class
class Platform {

 int platformNumber;
 boolean occupied;

 public Platform(int platformNumber) {
     this.platformNumber = platformNumber;
     this.occupied = false;
 }
}

//Main Class
public class RailwayPlatformAllocation {

 public static void main(String[] args) {

     // Store platforms
     Map<Integer, Platform> platformMap = new HashMap<>();
     platformMap.put(1, new Platform(1));
     platformMap.put(2, new Platform(2));

     // Incoming trains (sorted by arrival time)
     PriorityQueue<Train> trainQueue = new PriorityQueue<>();

     trainQueue.add(new Train("Express", 1000));
     trainQueue.add(new Train("Superfast", 930));
     trainQueue.add(new Train("Passenger", 1100));

     while (!trainQueue.isEmpty()) {

         Train train = trainQueue.poll(); // earliest train first
         boolean allocated = false;

         try {
             // Allocate nearest available platform
             for (int i = 1; i <= platformMap.size(); i++) {

                 Platform p = platformMap.get(i);

                 if (!p.occupied) {
                     p.occupied = true;
                     allocated = true;

                     System.out.println(train.trainName +
                             " allocated to Platform " + p.platformNumber);
                     break;
                 }
             }

             if (!allocated) {
                 throw new PlatformUnavailableException(
                         "No platform available for " + train.trainName);
             }

         } catch (PlatformUnavailableException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}
